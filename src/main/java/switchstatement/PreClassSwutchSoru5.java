package switchstatement;

import java.util.Locale;
import java.util.Scanner;

public class PreClassSwutchSoru5 {
    public static void main(String[] args) {

        //Kullanicidan gun ismini alip haftaici veya hafta sonu yazdiralim
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bir gun ismi giriniz");
        String gunIsmi = input.next().toLowerCase();

        switch (gunIsmi) {
            case "pazar":
                System.out.println("Pazar:  Hafta sonu");
                break;
            case "pazartesi":
                System.out.println("Pazartesi : Hafta ici");
                break;
            case "sali":
                System.out.println("Sali : Hafta ici");
                break;
            case "carsamba":
                System.out.println("Carsamba : Hafta ici");
                break;
            case "persembe":
                System.out.println("Persembe : Hafta ici");
                break;
            case "cuma":
                System.out.println("Cuma : Hafta ici");
                break;
            case "cumartesi":
                System.out.println("Cumartesi : Hafta Sonu");
                break;
            default:
                System.out.println("Gecerli bir gun adi giriniz");

        }
    }
}