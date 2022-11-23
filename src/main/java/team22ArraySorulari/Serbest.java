package team22ArraySorulari;

import java.util.Scanner;

public class Serbest {
    public static void main(String[] args) {
        
   
     /*
       Ogretmen ogrencilerin defter ihtiyacini karsilamak icin sinifa X adet
       defter getirmistir. Ogrencilerin defter ihtiyaci azdan coga dogru sirali bir tamsayi
       dizisi olarak verilmisitr. Ogretmen en fazla kac ogrencinin defter ihtiyacini karsilayabilir
       (need[i]>0)
       input
       need [] ={1,3,3,5,6,10,20,50,100}
       output
       Defter ihtiyaci karsilanan ogrenci sayisi    kisidir*/
    
    int need[]={1,3,3,5,6,10,20,50,100};
    Scanner input=new Scanner(System.in);
        System.out.println("Kac kitap dagitmak istiyorsunuz");
    int notebook=input.nextInt();
    int counter=0;
        for (int i = 0; i < need.length; i++) {
            if (need[i]<=notebook){
                notebook=notebook-need[i];
                counter++;
            }
            
        }
        System.out.println( counter +" ögrencinin ihtiyaci karsilanmistir");
}
}