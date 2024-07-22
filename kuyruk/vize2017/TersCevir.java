/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vize2017;


import java.util.Stack;

public class TersCevir {

    public static int tersCevir(int sayi) {
        Stack<Integer> yigit = new Stack<>();

        // Sayıyı basamaklarına ayır ve yığıta ekle
        while (sayi > 0) {
            int rakam = sayi % 10;
            yigit.push(rakam);
            sayi /= 10;
        }

        // Yığıttan çıkararak sayıyı ters çevir
        int tersSayi = 0;
        int basamak = 1;
        while (!yigit.isEmpty()) {
            tersSayi += yigit.pop() * basamak;
            basamak *= 10;
        }

        return tersSayi;
    }

    public static void main(String[] args) {
        int girilenSayi = 2314;
        int tersSayi = tersCevir(girilenSayi);
        System.out.println(girilenSayi + " sayısının ters çevrilmiş hali: " + tersSayi);
    }
}
