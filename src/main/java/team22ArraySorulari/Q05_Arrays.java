package team22ArraySorulari;

import java.util.Arrays;

public class Q05_Arrays {
    public static void main(String[] args) {


        // Arrays soru 5 :verilen bir tamsayi dizisinin en buyuk ve en kucuk elemanlarini bulup yer degistirn
        //input= {10,13,56,20,40,60,56,32}

        int arr[] = {10, 13, 56, 20, 40, 60, 56, 32};

        int idxmax =0;
        int max = arr[0];

        System.out.println();
            for (int i = 0; i < arr.length; i++) {
            if (arr[i]>max){
            max=arr[i];
            idxmax=i;

        }
            }
        System.out.println("idxmax = " + idxmax);


        int idxMin=0;
        int min=arr[0];
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i]<min){
                min=arr[i];
                idxMin=i;

            }
        }
        System.out.println("idxMin = " + idxMin);


        int temp=arr[idxMin];
        arr[idxMin]=arr[idxmax];
        arr[idxmax]=temp;

      System.out.print(Arrays.toString(arr));

    }


    }




