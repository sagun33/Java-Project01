package calismasorulari;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Soru5 {
    public static void main(String[] args) {
        dizi(2,4,5,6);



    /* soru 5 :
        Kullanıcıdan alacağınız 6 elemanlı bir dizinin
        sadece tek elemanlarını ayrı diziye bir metodda atayarak
         yazdırınız.
        */
//
        }

    private static void dizi(int...a) {
        int arr[]=new int[6];
        List<Integer>list=new ArrayList<>();

        Scanner input = new Scanner(System.in);

        for (int i = 0; i <arr.length ; i++) {
            arr[i]=input.nextInt();
            if (arr[i]%2==0){
                continue;
            }else {

                Arrays.asList(arr[i]);

            }



    }
        System.out.println(list);



    }
}
