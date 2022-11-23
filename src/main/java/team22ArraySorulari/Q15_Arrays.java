package team22ArraySorulari;

public class Q15_Arrays {//?????
    /*
 N elemanli bir dizi veriliyor. Dizinin elemanlarini ekrana yazdirin
 ancak her satirda 6 eleman goruntulensin(son satir istisna)
 Bos kalan yerlere de 00 yazdirin
 input={10,32,23,17,40,20,86,65,76,19,10,32,23,17,40,20,86,65,76,19}
 output
 10 32 23 17 40 20
 86 65 76 19 10 32
 23 17 40 20 86 65
 76 19 00 00 00 00
  */
    public static void main(String[] args) {

        int[] output = new int[]{10, 32, 23, 17, 40, 20, 86, 65, 76, 19, 10, 32, 23, 17, 40, 20, 86, 65, 76, 19};


        int k = 6;

        for (int i = 0; i < output.length; i++) {

            System.out.print(output[i] + " ");
//
            if ((i + 1) % k == 0) System.out.println();
        }

        int kalan = k;
        kalan= k - output.length % k;

        for (int i = 0; i < kalan; i++) {
            System.out.print("OO ");
        }
    }
}
