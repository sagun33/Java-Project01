package team22ArraySorulari;

import java.util.Arrays;

public class Q08_Arrays {
    public static void main(String[] args) {
        /*8.soru
    Bir dersten ogrencilerin aldigi notlar,tamsayi dizisi olarak veriliyor
    En yuksek notu kac ogrenci almisitr
    input={95,70,80,90,65,75,95,47,73,56,72,95}
    output=3
      */

        int arr[]={95,70,80,90,65,75,95,47,73,56,72,95};
        Arrays.sort(arr);
          int counter=0;
         int max= arr[arr.length-1];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==max){
                counter++;
            }


        }
        System.out.println("counter = " + counter);




    }
}