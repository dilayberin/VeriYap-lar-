/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BagliListe;

import java.util.Scanner;


public class kSilme2 {
   public static void elemanSilme(int d[],int k){
       for (int i = k; i < d.length-1; i++) {
           d[i]=d[i+1];
       }
   }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("dizinizin boyutunu giriniz-->");
        int b=s.nextInt();
        int d[]=new int[b];
        for (int i = 1; i <= b; i++) {
            System.out.println("Dizinizin"+" "+i+". ci elemanını giriniz:");  
            d[i]=s.nextInt();
        }
        System.out.println("diziden silmek istediğiniz elemanın indisini giriniz:");
        int silinecek=s.nextInt();
        elemanSilme(d, silinecek);
        
        System.out.println("silindi; yeni dizi---->");
        for (int i = 0; i < d.length-1; i++) {
            System.out.println(d[i]);
        }
    }
}
