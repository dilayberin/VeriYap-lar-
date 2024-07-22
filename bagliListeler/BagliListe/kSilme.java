/*
 bir dizinin k nıncı elemanını silen algoritma
 */
package BagliListe;

import java.util.Scanner;


public class kSilme {
       public static void dizidenSil(int dizi[],int k
       ){
           
    
           for (int i = k; i < dizi.length-1; i++) {
               dizi[i]=dizi[i+1];
           }
       
}
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Dizinin boyutunu girin: ");
        int boyut = s.nextInt();

        int[] dizi = new int[boyut];

        System.out.println("Dizi için " + boyut + " sayı giriniz:");

        for (int i = 0; i < boyut; i++) {
            System.out.println((i + 1) + ". sayıyı giriniz: ");
            dizi[i] = s.nextInt();
        }

        System.out.print("Silmek istediğiniz elemanın indisini girin: ");
        int k = s.nextInt();

        dizidenSil(dizi, k);

        System.out.println("Eleman silindi. Yeni dizi:");
        for (int i = 0; i < dizi.length - 1; i++) {
            System.out.print(dizi[i] + " ");
    }
  
}
}