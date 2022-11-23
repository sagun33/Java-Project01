package team22ArraySorulari;

public class Q14_Arrays {
    /*
        Bir sinifta bir derse ait notlar veriliyor, sinifin not ortalamsin
        daha yuksek not alan ogrenciler basarili sayiliyor, kac kisinin basarili oldgunu bulan kod yazdiriniz
        input={100,70,80,70,20,30,50,50,65,55,57}
        output
        ortalamayai bulan ve asan ogrenci sayisi:
     */
    public static void main(String[] args) {



    int arr[]={100,70,80,70,20,30,50,50,65,55,57};

    int sum=0;
    int uzunluk=0;
        for (int i = 0; i <arr.length ; i++) {
            sum+=arr[i];
            uzunluk=i+1;

        }
        System.out.println("sum = " + sum);
       double ortalama=sum*1.0/uzunluk;
        System.out.println("uzunluk = " + uzunluk);
        System.out.println("ortalama = " + ortalama);
         int counter=0;
        for (int i = 0; i <arr.length ; i++) {
            
            if(arr[i]>=58){
                counter++;
                
            }
            
        }
        System.out.println("counter = " + counter);
    }
}