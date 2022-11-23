package team22ArraySorulari;

import java.util.Arrays;

public class Q09_Arrays {
    /*9.soru
           bir sinifa ait notlar veriliyor(1-100°,dersin hocasi en yuksek notu alan
           ogrencinin notunu 100'e tamamliyor ve bu ogrenciye ekledigi puan kadar
           tum ogrencilere puan ekliyor. Ogrencilerin ekleme sonrasi notlarini listeleyiniz
            notlar dizisi={70,80,90,65,75,90,69,72,87,90,75}
            output={80,90,100,75,85,100,79,82,97,100,85}*/
    public static void main(String[] args) {
        int arr[]={70,80,90,65,75,90,69,72,87,90,75};
        System.out.println(Arrays.toString(arr));
         int max=arr[0];
        int fark=0;
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i]>max){
                max=arr[i];
                
            }if (max<100){
                fark=100-max;
            }
        }
        System.out.println("max not = " + max);


        for (int i = 0; i < arr.length; i++) {
            arr[i]+= fark;

        }
        System.out.println(Arrays.toString(arr));

        }
        
    }

