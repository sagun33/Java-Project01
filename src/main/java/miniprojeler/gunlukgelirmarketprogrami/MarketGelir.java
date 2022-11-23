package miniprojeler.gunlukgelirmarketprogrami;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MarketGelir {


    static List<String> gunler = new ArrayList<>(Arrays.asList("Pazartesi", "Sali", "Carsamba", "Persembe", "Cuma", "Cumartesi", "Pazar"));
    static List<Double> gunlukGelirler = new ArrayList<>();
    static double toplamGelir = 0;


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int gun = 0;
        while (gun < 7) {
            System.out.println(gunler.get(gun) + " gelirini giriniz");
            double gununGeliri = input.nextDouble();
            gunlukGelirler.add(gununGeliri);
            toplamGelir += gununGeliri;
            gun++;
        }
        System.out.println("Gunluk Gelirler" + gunlukGelirler);
        System.out.println("Toplam Gelir = " + toplamGelir);
        System.out.println("Gelir ortalamasi: " + gelirOrtalamasi());
        System.out.println("Ortalama Ustu Gunler: " + ortalamaUstuGunler());
        System.out.println("Ortalama Alti Gunler: " + ortalamaAltiGunler());


    }

    static double gelirOrtalamasi() {
        return toplamGelir / gunler.size();
    }

    static String ortalamaUstuGunler() {
        String str = "";
        for (int i = 0; i < gunlukGelirler.size(); i++) {
            if (gunlukGelirler.get(i) > gelirOrtalamasi()) {
                str += gunler.get(i) + " ";
            }
        }
        return str;
    }

    static String ortalamaAltiGunler() {
        String str = "";
        for (int i = 0; i < gunlukGelirler.size(); i++) {
            if (gunlukGelirler.get(i) < gelirOrtalamasi()) {
                str += gunler.get(i) + " ";
            }
        }
        return str;
    }
}
