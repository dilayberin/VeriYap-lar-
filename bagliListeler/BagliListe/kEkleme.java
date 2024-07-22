/*
bir dizinin k.nıncı elemanı yerine yeni eleman ekleme HATALIIId
 */
package BagliListe;

import java.util.Scanner;


public class kEkleme {
    public static void diziyeEkle(int d[],int k,int yeni){
        for (int i = d.length-1; i > k; i--) {
            d[i+1]=d[i];
        }
        d[k]=yeni;
    }
    
    
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        
        System.out.println("dizinizin boyutunu gir:");
        int boyut=s.nextInt();
        int d[]=new int[boyut];
        
        for (int i = 0; i < boyut+1; i++) {
            System.out.println("dizinizin"+" "+(i+1)+". ninci elemanını giriniz:");
            int degerler=s.nextInt();
            d[i]=degerler;
        }
        System.out.println("yerine yeni deger getirilecek elemanı giriniz:");
        int silinecek=s.nextInt();
        
        System.out.println("sildiğiniz eleman yerine girilecek elemanı giriniz:");
        int yeni=s.nextInt();
        diziyeEkle(d, silinecek, yeni);
        
        System.out.println("seçtiğiniz deger silindi,yeni girdiğiniz değerle birlikte yeni diziniz:");
        for (int i = 0; i < d.length; i++) {
            System.out.println(d[i]);
        }
    }
}
