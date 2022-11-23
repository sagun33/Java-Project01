package yenisorular;

public class Q05_Arrays {
    public static void main(String[] args) {

        /* soru 5 :
  Elinizde bir miktar farklı boylarda somun ve bu somunlara uyacak civatalar olsun.
  Civataları somunlara eşlemek için nasıl bir algoritma yazarsınız.
 Somun = {1, 3, 6, 5, 2};
 Civata = {1, 2, 3, 6, 5};
   */

        int somun[]={1, 3, 6, 5, 2};
        int civata[]= {1, 2, 3, 6, 5};

        for (int i = 0; i < somun.length; i++) {
            for (int j = 0; j < civata.length; j++) {
                if (somun[i]==civata[j]){
                    System.out.println("Somunun  "+i+ ". indexi  "+ "civatanin  "+ j+". indexine esittir ");

                }

            }

        }

    }
}
