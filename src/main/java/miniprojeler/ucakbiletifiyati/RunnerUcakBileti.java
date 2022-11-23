package miniprojeler.ucakbiletifiyati;

public class RunnerUcakBileti {
    /* soru 9:


       A şehrinden uçmak isteyen bir yolcu
       B şehrine  500km
       C şehrine  700km
       D şehrine  900 km mesafededir.



       Bilet tarifesi:

       km birim fiyati : 0.10$ ==> normal fiyat=0.10x500=50

       yolcu 12  yasindan kucukse toplam fiyat %50 indirim,
       12 (dahil)  ve 24 yas arasindaysa 10% indirim,
       65 ve 65 yasindan buyukse 30% indirim,
       bilet gidis donus alinirsa 20% indirim uygulayan bir app create ediniz */

    public static void main(String[] args) {

        UcakBiletiFiyatiHesaplama bilet1=new UcakBiletiFiyatiHesaplama();
        System.out.println("bilet1.genelIndirim(500,12,1) = " + bilet1.genelIndirim(500, 12, 1));
    }
}
