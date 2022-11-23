package team22ArraySorulari;

public class Q16_Arrays {
     /*
    Bir spor musabakasinda sira ile sporcular parkuru tamamlamaktadir.
    Her bir sporcu kendisinden onceki tum sporculardan daha hizli bir rekor kirmis sayilir.
    Bu musabakada toplam kac kez rekor kirilmistir.
    input:scores dizisi
    output:rekor sayisi
     */
     public static void main (String[]args){


         double[] scores = new double[]{10, 9.9, 11.5, 13, 9, 11, 8.9, 8.8};
         int recores = 0;
         for (int i = 0; i < scores.length; i++) {
             boolean rekor = true;
             for (int j = 0; j < i; j++) {
                 if (scores[j] < scores[i]) {
                     rekor = false;
                     break;
                 }
             }
             if (rekor) recores++;
         }
         System.out.println("recores = " + recores);
     }

}