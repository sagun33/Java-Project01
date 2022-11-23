package team22ArraySorulari;

public class Q06_Arrays {
    public static void main(String[] args) {
        //soru 6:verilen bir tam sayi dizisinin en buyuk ve en kucuk elemanlari arasindaki sayilarin
        //toplamini bulunuz

        //input={10,13,56,20,40,60,56,32}

        int arr[]={10,13,56,20,40,60,56,32};
        int max=arr[0];
        int idxMax=0;
        int min=arr[0];
        int idxMin=0;
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i]>max){
                max=arr[i];
                idxMax=i;
                
            }if (arr[i]<min){
                min=arr[i];
                idxMin=i;
            }

        }
        System.out.println("max = " + max);
        System.out.println("sayi = " + idxMax);


            
        System.out.println("min = " + min);
        System.out.println("idxMin = " + idxMin);


        int sum=0;
        for (int i=idxMin+1; i < idxMax; i++) {
            sum+=arr[i];


        }
        System.out.println("sum = " + sum);
    }
}
