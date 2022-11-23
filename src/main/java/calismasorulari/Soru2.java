package calismasorulari;

import com.sun.source.tree.ArrayAccessTree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Soru2 {
    public static void main(String[] args) {
        /*Soru 2 :
        2 Boyutlu bir Multidimensional array i input kabul edip, arraydeki tüm elemanları bir
        listeye kopyalayan ve harf sırasına göre yazdıran bir METHOD yazınız.
        Eg : Input : {{Ali,Veli,Ayse},{Hasan,Can},{Suzan}}
        Output:[Ali, Ayse, Can, Hasan, Suzan, Veli]
         */
        String[][] arr = {{"Ali", "Veli", "Ayse"}, {"Hasan", "Can"}, {"Suzan"}};
        List<String> list = new ArrayList<>();



        for (String[] w : arr) {
            for (String k:w) {
                list.add(k);

            }




        }

        System.out.println(list);
        list.sort(Comparator.comparing(String::toString));
        System.out.println(list);


    }
}



