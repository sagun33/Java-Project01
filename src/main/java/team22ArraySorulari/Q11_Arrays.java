package team22ArraySorulari;

public class Q11_Arrays {

    /*
        Bir siniftaki ogrencilerin boylari tamsayi olarak sirasiz veriliyor,
        ayrica bu sinifin ogrencisi olan Ali'nin boyu veriliyor. Beden egitimi dersinde
        buyukten kucuge dogru ogrenciler siralandiginda Ali kacinci sirada olur(en uzun
        ogrenci 1. siradadir, Ali'nin boyu verilen dizide de yer almaktadir
         */


    //Once Ali'den kac kisi uzun oldugunu bulmak lazim
    //Sonra Ali ile ayni boyda kac kisi var onu bulmam lazim
    //Ve son olarakta Ali'nin muhtemel siralari

    public static void main(String[] args) {

        int []boylar = new int []{190,175,185,175,177,178,198,175,187,182 };//Burda boylar diye bir dizi olusturdum
        int alidenKacKisiUzun= 0;//Aliden kac kisi uzun oldugunu hesapladim baslangicta sifir kisi
        int alidenAyniBoydanOlanlar=0;//bunuda sifira esitledim
        int alininBoyu=175;//Alinin boyuna 170 verdim kafadan

        //for dongusu aciyorum

        for (int i = 0; i <boylar.length ; i++) {

            if (boylar[i]==alininBoyu) alidenAyniBoydanOlanlar++;//Alinin boyu ile esit olanalari sayacak

            else if (boylar[i]>alininBoyu) alidenKacKisiUzun++;//Aliden uzun olanlari sayacak

        }
        int altSira=alidenKacKisiUzun+1;//Aliden uzun bir kise ise Ali 2.sirada olur (+1)
        int ustSira=alidenKacKisiUzun+alidenAyniBoydanOlanlar;//en geride durma durumu

        System.out.println("Ali " + altSira+" ile "+ustSira+" arasinda bir yerdedir");



    }

}




