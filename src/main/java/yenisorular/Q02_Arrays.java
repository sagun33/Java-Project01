package yenisorular;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Q02_Arrays {


    public static void main(String[] args) {

         /* 2. soru:  Pasta yapımı için marketten malzemeler alınacak.
         Bu malzemeleri klavyeden diziye atayacağız.
         Daha sonra atadığımız malzemelerden birini silen programı
          yazacağız.
         */

            String arr[]=new String[]{"un","seker","yag","vanilya","yumurta"};

            List<String> list=new ArrayList<>(Arrays.asList("un","seker","yag","vanilya","yumurta"));
            System.out.println("list = " + list);

            list.remove(1);
            System.out.println("list = " + list);















//        int sayac = 0;
//        int[] arr = {10, 5, 7, 8, 45, 9, 10, 45, 78, 32};
//        int counter=0;
//        Scanner input = new Scanner(System.in);
//        System.out.println("array da kac adet oldugunu ogrenmekm istediginiz sayiyi giriniz");
//
//        int sayi = input.nextInt();
//
//        System.out.println("girdiginiz say: "+sayi);
//
//
//        for (int i = 0; i < arr.length; i++) {
//
//            if (sayi==arr[i]){
//                counter++;
//            }
//
//
//
//
//        }
//        System.out.println(counter+ " kere tekrar etmistir");

    }


}
