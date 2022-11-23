package team22ArraySorulari;

public class Q10_Arrays { //?????
    /*
       Ogretmen ogrencilerin defter ihtiyacini karsilamak icin sinifa X adet
       defter getirmistir. Ogrencilerin defter ihtiyaci azdan coga dogru sirali bir tamsayi
       dizisi olarak verilmisitr. Ogretmen en fazla kac ogrencinin defter ihtiyacini karsilayabilir
       (need[i]>0)
       input
       need [] ={1,3,3,5,6,10,20,50,100}
       output
       Defter ihtiyaci karsilanan ogrenci sayisi    kisidir*/
    public static void main(String[] args) {
        int defterSayisi = 300000;
        int defterIhtiyaci[] = {1, 3, 3, 5, 6, 10, 20, 50, 100};
        int counter = 0;
        for (int i = 0; i < defterIhtiyaci.length; i++) {

            if (defterIhtiyaci[i] <= defterSayisi) {
                defterSayisi=defterSayisi-defterIhtiyaci[i];
                counter++;

            } else break;


        } if (counter == defterIhtiyaci.length) {
            System.out.println(counter + " ogrencinin tum ihtiyaci  karsilanmistir");

        }
//       else System.out.println(counter+ " ogrencinin ihtiyaci karsilanmistir");

        }
    }
