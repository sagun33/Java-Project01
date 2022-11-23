package calismasorulari;

import java.util.ArrayList;
import java.util.List;

public class Soru1 {
    public static void main(String[] args) {

        /*soru 1 :          Input olarak verilen listteki isimlerden
        icinde 'a' harfi bulunanlari silen bir code create ediniz.
        INPUT : list1={"Ali","Veli","Ayse","Fatma","Omer"}         * OUTPUT : [Veli,Omer]         */

        List<String> list=new ArrayList<>();
        list.add("Ali");
        list.add("Veli");
        list.add("Ayse");
        list.add("Fatma");
        list.add("Omer");

        System.out.println("list = " + list);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).contains("a")||list.get(i).contains("A")){

                list.remove(list.get(i));
          i--;
            }

        }
        System.out.println(list);



    }
}
