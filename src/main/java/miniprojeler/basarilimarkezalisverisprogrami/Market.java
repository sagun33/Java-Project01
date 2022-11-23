package miniprojeler.basarilimarkezalisverisprogrami;

import java.util.HashMap;
import java.util.Map;

public class Market {
    public static void urunListesi(){
        Map<String,Double>urunler=new HashMap<>();
        urunler.put("Domates",2.10);
        urunler.put("Patates",3.20);
        urunler.put("Biber",1.50);
        urunler.put("Sogan",2.30);
        urunler.put("Havuc",3.10);
        urunler.put("Elma",1.20);
        urunler.put("Muz",1.90);
        urunler.put("Cilek",6.10);
        urunler.put("Kavun",4.30);
        urunler.put("Uzum",2.70);
        urunler.put("Limon",0.50);
        System.out.println(urunler);

    }
}
