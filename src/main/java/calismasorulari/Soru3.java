package calismasorulari;
/* Soru 3 :
   Bir integer list oluşturunuz ve bu list'deki tum sayıların karesinin
   toplamını bulan code create ediniz.
    */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Soru3 {
    public static void main(String[] args) {

        int arr[]={1,2,3,4,5,6,7,8};
        List<Integer>list=new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8));
        int sum=0;
        for (Integer w:list) {
            sum+=w*w;


        }
        System.out.println(sum);


    }
    }

