package yenisorular;

public class Q01_Arrays { //????
    /*
   Tam sayilardan olusan bir arrayimiz var. Bu arrayin ikili elemanlarinin (i,j) toplaminin
    verilen k elamanina  bolunebildigini kontrol eden bir kod yazin
   input=
   arr=[1,2,3,4,5,6]
   k=5;
   output= 3 adet ikili kritere uymaktadiroutput.  (bunlar [1,4],[2,3]ve [4,6])
    */
    public static void main(String[] args) {

        int arr[] = {1, 2, 3, 4, 5, 6};
        int k = 5;


         int brr[]=new int[2];
         int idx=0;

        for (int i = 1; i < arr.length; i++) {

                 if(arr[i]+arr[i-1]%k==0){


            }

        }
    }
}




