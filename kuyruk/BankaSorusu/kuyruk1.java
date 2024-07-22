/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BankaSorusu;

import java.util.Scanner;

class Kuyruk {

    musteri[] dizi;
    int bas, son;
    int boyut;
    int elemanSayisi;

    public Kuyruk(int boyut) {
        dizi = new musteri[boyut];
        bas = 0;
        son = 0;
        elemanSayisi = 0;
        this.boyut = boyut;
    }

    boolean doluMu() {
        return bas == (bas + 1) % boyut;
    }

    boolean bosMu() {
        return bas == son;
    }

    void musteriEkle(musteri yeni) {
        if (!doluMu()) {
            dizi[son] = yeni;
            son = (son + 1) % boyut;
        }
    }

    musteri Sil() {
        musteri tmp;
        if (!bosMu()) {
            tmp = dizi[bas];
            bas = (bas + 1) % boyut;
            return tmp;
        }
        return null;
    }
    
    void yazdir(){
        for (int i = 0; i <boyut ; i++) {
            System.out.println((i+1) + ". müşteri " + dizi[i].isim + " işlemi : " + dizi[i].islem);
        }
    }

}

public class kuyruk1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kaç müşteri ekleyeceksin?");
        int sayi = scanner.nextInt();
        
        Kuyruk paraEkle = new Kuyruk(sayi);
        Kuyruk paraCikar = new Kuyruk(sayi);
        Kuyruk hesapAc = new Kuyruk(sayi);
        Kuyruk sonListe = new Kuyruk(sayi);
        
        //kullanıcıları uygun kuyruklara atama
        for (int i = 0; i < sayi; i++) {
            
            System.out.print((i + 1) + ". kullanıcı adını girin: ");
            String ad = scanner.nextLine();
            System.out.println("\n--------------------------");
            System.out.println("Kullanıcı işlemini girin: ");
            String islem = scanner.nextLine();

            if (islem.toLowerCase().equals("para ekle")) {
                if (!paraEkle.doluMu()) {
                    paraEkle.musteriEkle( new musteri(ad, islem));
                } else {
                    System.out.println("Para yükleyecek kullanıcı sayısı full");
                }
            } 
            else if (islem.toLowerCase().equals("para cekme")) {
                if (!paraCikar.doluMu()) {
                    paraCikar.musteriEkle( new musteri(ad, islem));
                } else {
                    System.out.println("Para Cekecek kullanıcı sayısı full");
                }
            } 
            else if (islem.toLowerCase().equals("yeni hesap")) {//büyük harfleri küçüğe çevirir(to lowercase)
                if (!hesapAc.doluMu()) {
                    hesapAc.musteriEkle( new musteri(ad, islem));
                } else {
                    System.out.println("Yeni kullanıcı sayısı full");
                }
            } 
            else {
                System.out.println("Yanlış giriş yaptınız");
                i--;
            }

        }

        //son kuyruğa sıralama - 2 para ekle - 1 hesap ac - 1 para cikar&
        while (!paraEkle.bosMu() || !paraCikar.bosMu() || !hesapAc.bosMu()) {
            if (!paraEkle.bosMu()) {
                musteri newMusteri = paraEkle.Sil();
                sonListe.musteriEkle(newMusteri);
            }
            if (!paraEkle.bosMu()) {
                musteri newMusteri = paraEkle.Sil();
                sonListe.musteriEkle(newMusteri);
            }
            if (!hesapAc.bosMu()) {
                musteri newMusteri = hesapAc.Sil();
                sonListe.musteriEkle(newMusteri);
            }
            if (!paraCikar.bosMu()) {
                musteri newMusteri = paraCikar.Sil();
                sonListe.musteriEkle(newMusteri);
            }
        }
        
        sonListe.yazdir();

    }

}
