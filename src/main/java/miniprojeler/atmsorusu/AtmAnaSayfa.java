package miniprojeler.atmsorusu;



import okulyonetimi.OkulAnasayfa;

import java.util.Scanner;

public class AtmAnaSayfa {



    static Scanner input = new Scanner(System.in);
    static private double bakiye;
    static private String kartNumarasi;
    static private String sifre;
    static private String iban;



    public static Scanner getInput() {
        return input;
    }

    public static void setInput(Scanner input) {
        AtmAnaSayfa.input = input;
    }

    public double getBakiye() {
        return bakiye;
    }

    public void setBakiye(double bakiye) {
        this.bakiye = bakiye;
    }

    public String getKartNumarasi() {
        return kartNumarasi;
    }

    public void setKartNumarasi(String kartNumarasi) {
        this.kartNumarasi = kartNumarasi;
    }

    public String getSifre() {
        return sifre;
    }

    public void setSifre(String sifre) {
        this.sifre = sifre;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }


    public static void atmIslem() {
        System.out.println("---------------# ATM ANA SAYFA #-------------------------");



        System.out.println("1.Para Yatirma Islemi \n" +
                "2.Para Cekme Islemi\n" +
                "3.Para Gonderme Islemi\n"+
                "4.Bakiye Sorgulama\n"+
                "Q. Cikis\n" );

        System.out.println("Yapmak istediginiz islemi seciniz veya cikis icin 'Q' ya basiniz");


        String secim = input.next().toUpperCase();

        boolean scm = true;
        do {
            switch (secim) {
                case "1":
                    System.out.println("Para Yatirma islemi");
                    paraYatirma();
                    scm = false;
                    break;
                case "2":
                    System.out.println("para cekme islemi");
                    paraCekme();

                    scm = false;
                    break;
                case "3":
                    System.out.println("para gönderme islemi");

                  paraGonderme();
                  atmIslem();
                    scm = false;
                    break;
                case "4":
                    System.out.println("bakiye sorgulama islemi");

                  bakiyeEkranGoruntusu();
                    scm = false;
                    break;
                case "Q":
                    System.out.println("Sayfamizi ziyaret ettiginiz icin tesekkur ederiz\n" +
                            "Iyi Gunler Dileriz :)");
                    scm = false;
                    break;
                default:
                    System.out.println("Yanlis bir secim yaptiniz. Tekrar giris yapiniz");
                    secim = input.next().toUpperCase();
            }
        } while (scm);

        atmIslem();



}
    private static double paraCekimindenSonraBakiye(double miktar){
        bakiye =  bakiye -miktar;
        return bakiye;
    }
    private static double paraYatirmadanSonraBakiye(double miktar){
        bakiye =  bakiye+ miktar;
        return miktar;
    }
    private static double paraGönderdiktenSonraBakiye(double miktar){
        bakiye =  bakiye- miktar;
        return miktar;
    }
    //Musteri ile para cekmek icin etkilesime gecelim: checking hesap
    public static void paraCekme(){
        kartNo();
        sifre();
        bakiyeEkranGoruntusu();

        System.out.println("Cekmek istediginiz miktari giriniz:");
        double miktar = input.nextDouble();
        if(miktar <= 0) {
            System.out.println("Sifir veya eksi rakamlar gecersizdir!");
            paraCekme();//recursive method //medthodu tekrardan cagirma
        }
        else if(miktar <= bakiye){
            paraCekimindenSonraBakiye(miktar);
            bakiyeEkranGoruntusu();
        }else {
            System.out.println("Yetersiz bakiye!");
        }
    }
    //Para yatirma(checking): Musteri ile para yatirmak icin etkilesime gecelim
    public static void paraYatirma(){
        kartNo();
        sifre();
        bakiyeEkranGoruntusu();
        System.out.println("Yatirmak istediginiz miktari giriniz:");
        double amount = input.nextDouble();
        if(amount <= 0){
            System.out.println("Sifir veya eksi rakamlar gecersizdir!");
            paraYatirma();
        }else {
            paraYatirmadanSonraBakiye(amount);
            System.out.println();
            bakiyeEkranGoruntusu();
        }
    }

    //Para yatirma(checking): Musteri ile para yatirmak icin etkilesime gecelim
    public static void paraGonderme(){
        kartNo();
        sifre();
        bakiyeEkranGoruntusu();
        System.out.println("Gondermek istediginiz miktari giriniz:");
        double amount = input.nextDouble();
        if(amount <= 0){
            System.out.println("Sifir veya eksi rakamlar gecersizdir!");
            paraGonderme();
        }else {
            paraGönderdiktenSonraBakiye(amount);
            System.out.println();
            bakiyeEkranGoruntusu();
        }
    }
    public static void bakiyeEkranGoruntusu(){
        System.out.println("hesabinizda bulunan bakiye: "+(bakiye));
    }
    public static void kartNo(){
        System.out.println("16 haneli Kart numaranizi giriniz ");
        kartNumarasi=input.next();
        if (!kartNumarasi.matches("[0-9]{2}")){
            System.out.println("kart numaraniz yanlistir");
            kartNo();
        }else
            System.out.println("kart numaraniz dogrudur");



    }
    public static void sifre (){
        System.out.println("sifrenizi giriniz ");
        sifre=input.next();

    if (sifre.matches("[0-9]{4}")) {
        System.out.println("Girdiginizsifre dogrudur");

    } else if (!sifre.matches("[0-9]{4}")) {
        System.out.println("sifreniz yanlistir ");
        sifre();


    }









}
}





