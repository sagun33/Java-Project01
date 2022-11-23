package yenisorular;

import java.util.ArrayList;
import java.util.Arrays;

public class ListToArrays {
    public static void main(String[] args) {
        //Converting List to Array With Library Function

        //Declaration of Array List
        ArrayList<String> list = new ArrayList<String>();

        //Adding Elements to Array List
        list.add("California");
        list.add("Texas");
        list.add("Illinois");
        list.add("Massachusetts");
        list.add("Florida");
        list.add("Virginia");
        list.add("Colorado");


        //Printing the Array List
        System.out.println("Elements of List: " + list);

        //Declaring Array with Equal Size to the List
        String[]arr = new String [list.size()];

        //Converting List to Array
        list.toArray(arr);

        //Printing the Array
        System.out.println("Array:  "+Arrays.toString(arr));
        System.out.print("Elements of Array: ");
        for (int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i] + "  ");
        }
    }
}


