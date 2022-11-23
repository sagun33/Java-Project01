package team22ArraySorulari;

import java.util.Arrays;

public class Q03_Array {
    public static void main(String[] args) {
         /*Arrays-3.soru
         verilen bir metnin tum kelimelerinin ilk harflerini buyuk
             digerleri kucuk olacak sekilde duzenleyin
             ornek input=>
             "buGUn hEr sEy cOK yORuCu ve bUNaLtIciYdI"
         */
        String s = "buGUn hEr sEy cOK yORuCu ve bUNaLtIciYdI";
        String srr[] = s.split(" ");
        String a = "";
        String b = "";


        for (int i = 0; i < srr.length; i++) {

            a = srr[i];
            b = a.substring(0, 1).toUpperCase() + a.substring(1).toLowerCase();

            System.out.print(b + " ");

        }


    }


}




