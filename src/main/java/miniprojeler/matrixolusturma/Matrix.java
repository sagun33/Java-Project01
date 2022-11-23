package miniprojeler.matrixolusturma;

import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("satir sayisi girin");
        int satir=input.nextInt();
        System.out.println("sutun sayisi girin");
        int sutun=input.nextInt();

        for (int i = 0; i <satir ; i++) {
            for (int j = 0; j <sutun ; j++) {
                System.out.print("  1 "+"  0 ");

            }
            System.out.println();
        }
    }
}
