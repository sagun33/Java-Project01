package team22ArraySorulari;

import java.util.Arrays;
import java.util.Collections;

public class Q07_Arrays {
    /*
        Bir siniftaki ogrencilerin boylari tam sayi olarak verilmistir, ayrica bu sinifin ogrencisi olan Ali'nin de
        boyu veriliyor,.Beden egitimi dersinde ogrenciler buyukten kucuge
        siralandiginda Ali kacinci sirada olur?(En uzun ogrenci 1. siradadir ve boy esitligi dikkate alinmamistir°
        input={170,180,167,165,175,190,169,172,187,178,175}
        Alinin boyu 175
        output=Ali 5.siradadir*/
    public static void main(String[] args) {
//
//        Integer arr[] = {170, 180, 167, 165, 175, 190, 169, 172, 187, 178, 175};
//        Arrays.sort(arr, Collections.reverseOrder());
//        System.out.println(Arrays.toString(arr));
//
//
//        int alininBoyu = 175;
//
//
//        for (int i = 0; i > arr.length; i++) {
//            if (alininBoyu == arr[i]) {
//                System.out.println("i = " + i);
//            }
//        }
//        System.out.println(idxAli);
        /*
        Bir siniftaki ogrencilerin boylari tam sayi olarak verilmistir, ayrica bu sinifin ogrencisi olan Ali'nin de
        boyu veriliyor,.Beden egitimi dersinde ogrenciler buyukten kucuge
        siralandiginda Ali kacinci sirada olur?(En uzun ogrenci 1. siradadir ve boy esitligi dikkate alinmamistir°
        input={170,180,167,165,175,190,169,172,187,178,175}
        Alinin boyu 175
        output=Ali 5.siradadir
        7. soru Cuma'ya ait.

      */
            Integer ogrencilerinBoylari[] = {170,180,167,165,175,190,169,172,187,178,175};
            Arrays.sort(ogrencilerinBoylari, Collections.reverseOrder());
            System.out.println(Arrays.toString(ogrencilerinBoylari));

            for (int i = 0; i < ogrencilerinBoylari.length; i++) {
                if (ogrencilerinBoylari[i] == 175) {
                    System.out.println("i = " + i);
                    break;
                }
            }
        }

    }






