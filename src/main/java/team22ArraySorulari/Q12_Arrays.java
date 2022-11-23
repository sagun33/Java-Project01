package team22ArraySorulari;

import java.util.Arrays;

public class Q12_Arrays {
    /*12.soru
    N elemanli bir tamsayi dizisi veriliyor, diziyi sondan basa dogru ters cevirin
    input={1,3,3,7,4,10,6}
    output={6,10,4,7,3,3,1}
    =>ikinci yolu da temp kullanarak cozun
    ipucu=>bir temp olusturup son elemani ile indekse atma ve bunu length bitene kadar devam etme
     */
    public static void main(String[] args) {
        int arr[]={1,3,3,7,4,10,6};
        int brr[]=new int[arr.length];
//
//        int idxBrr=0;
//        for (int i = arr.length-1; i >=0 ; i--) {
//
//
//         brr[idxBrr]=arr[i];
//
//        idxBrr++;
//        }
//        System.out.println(Arrays.toString(brr));
//2.yol
        int idxBrr=0;
        int temp=0;
        for (int i = arr.length-1; i>=0; i--) {
          temp=arr[i];
          arr[i]=brr[idxBrr];
          brr[idxBrr]=temp;

        idxBrr++;

        }
        System.out.println(Arrays.toString(brr));
    }
}
