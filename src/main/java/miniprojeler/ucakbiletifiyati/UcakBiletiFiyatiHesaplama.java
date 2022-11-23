package miniprojeler.ucakbiletifiyati;


public class UcakBiletiFiyatiHesaplama implements IndirimsizFiyat, YasIndirimi, YonIndirimi {



    double indirim;
    double fiyat;
    int km;
    int yas;





    @Override
    public  double fiyat(int km) {
        return fiyat=km*0.10;
    }

    @Override
    public double yasIndirimi(int yas) {

        if (yas > 0 && yas < 120) {
            if (yas < 12) {
               return  indirim =fiyat-fiyat * 0.50;

            } else if (yas >= 12 && yas < 24) {
               return indirim =fiyat- fiyat * 0.10;


            } else if (yas >= 65) {
                return indirim = fiyat-fiyat * 0.30;


            } else return indirim = 0;

        }

return yazdir();
    }

    @Override
    public double yonIndirimi(int yon) {
        if (yon==1||yon==2){
            if (yon==2){
                indirim=fiyat*0.20;
                return fiyat=fiyat-indirim;
            }else return fiyat(km)+yasIndirimi(yas);
        }else return yazdir();
    }

public double genelIndirim(int km,int yas,int yon){
      return fiyat(km)-yasIndirimi(yas)-yonIndirimi(yon);

}

public double yazdir(){
    System.out.println("gecersiz bir rakam girdiniz");
    return 0;
}
//    static int km;
//    static int yas;
//    static int yon;
//
//
//    public static void main(String[] args) {
//
//
//        Scanner input = new Scanner(System.in);
//        System.out.println("Gideceginiz yerin mesafesini girin");
//        km = input.nextInt();
//        System.out.println("Yasinizi giriniz");
//        yas = input.nextInt();
//        System.out.println("Yon durumunu belirtin");
//        yon = input.nextInt();
//
//
//        double fiyat;
//        double yasIndirimi;
//        double ciftYonluIndirim;
//
//
//            if (yon == 2) {
//                ciftYonluIndirim = fiyat * 0.20;
//                fiyat = fiyat - ciftYonluIndirim;
//
//            }
//            System.out.println("Biletin toplam fiyati: " + fiyat + "$");
//
//
//        } else System.out.println("Girdiginiz degerler yanlistir");
//
//    }
//
//
//}
//
    }














