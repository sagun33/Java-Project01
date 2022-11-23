package team22ArraySorulari;

public class Q04_Arrays {
    public static void main(String[] args) {
          /*Arrays-4.soru
    verilen bir array in en buyuk elemanini ve bu elemanin kacinci sirada oldugunu bulunuz
    input={10,13,56,20,40,60,56,32}

   */
        int arr[]={10,13,56,20,40,60,56,32,};
        int max=arr[0];
        for (int w:arr) {
            max=Math.max(max, w);

        }
        System.out.println("max = " + max);
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i]==max){
                System.out.println(max+" sayisi "+i+  ". index");
            }


        }







//       //2.yol
//       int arr[]={10,13,56,20,40,60,56,32};
//        Arrays.sort(arr);
//        System.out.println(Arrays.toString(arr));
//        System.out.println(arr[arr.length-1]);//en buyuk eleman
//        int uzunluk=0;
//        int i=0;
//        while (i < arr.length) {
//
//
//                i++;
//            } System.out.println(i);
//        
//
//            
        }
    }

