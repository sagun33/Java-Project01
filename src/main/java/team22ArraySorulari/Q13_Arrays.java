package team22ArraySorulari;

import java.util.Arrays;
import java.util.Scanner;

public class Q13_Arrays {
    /* 13.soru
            ilk iki elemani sira ile 0 ve 1 olan, N elemanli bir tamsayi dizisinin
            elemanlari kendilerinden onceki elemanin toplamidir.Bu diziyi ekrana yazdiriniz
            input=
             N
            numbers[0]=0
            numbers[1]=1
             output
             numbers={0,1,1,2,3,5,8,13}
            */
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Bir sayi giriniz");
        int N= scanner.nextInt();
        int arr[]=new int[N];
        arr[0]=0;
        arr[1]=1;

        for (int i = 2; i <arr.length ; i++) {
            arr[i]=arr[i-2]+arr[i-1];

        }
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i]+" ");

        }
        System.out.println();
        System.out.println(Arrays.toString(arr));

        }

    }

