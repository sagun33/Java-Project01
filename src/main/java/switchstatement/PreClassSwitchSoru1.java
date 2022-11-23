package switchstatement;

import java.util.Scanner;

public class PreClassSwitchSoru1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Haftanin kacinci gununu secmek isteriniz?");
        int haftaninKacinciGunu = input.nextInt();

        switch (haftaninKacinciGunu) {
            case 1:
                System.out.println("pazar");
                break;
            case 2:
                System.out.println("pazartesi");
                break;
            case 3:
                System.out.println("sali");
                break;
            case 4:
                System.out.println("carsamba");
                break;
            case 5:
                System.out.println("persembe");
                break;
            case 6:
                System.out.println("cuma");
                break;
            case 7:
                System.out.println("cumartesi");
                break;
            default:
                System.out.println("Lutfen gecerli bir sayi giriniz");
        }
    }
}
