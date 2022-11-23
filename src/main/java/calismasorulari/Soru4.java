package calismasorulari;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Soru4 {
    public static void main(String[] args) {


    /* soru 4:
         Bir öğretmenden girmek istediği kadar notu alınız, ve
         ortalamayı geçen öğrenci sayısını bulan code create ediniz.

        */


        int arr[] = new int[3];
        Scanner input = new Scanner(System.in);

        System.out.print("3 tane sayı girin :");
        int sum = 0;
        int counter=0;
        double average = sum / arr.length;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
            sum += arr[i];
            average=sum/arr.length;

            if (arr[i]>=average){
                counter++;
            }

            }
        System.out.println(counter);





    }
}

