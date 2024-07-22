/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package heaplab;

class Eleman {
    int sayi; // İçerik
    public Eleman(int sayi){
        this.sayi=sayi;
    }
}
public class Heapp {
    Eleman [] dizi; // Dizi tanımladık.
    int N; // Dizinin eleman sayısı
    int adet; // Girilen değer sayısı
    public Heapp(int N){
        this.N=N;
        dizi = new Eleman[N];
        adet=0;
    }
    boolean bosMu(){
        return adet == 0; // Hiçbir değer girilmemişse true değerini döndürecek.
    }
    boolean doluMu(){
        return adet == N; // Dizi eleman sayısı kadar değer girildiyse doludur.
    }

    void ekle(Eleman yeni){
        adet++; // adet şuan 1 oldu
        dizi[adet-1]=yeni;
        yukariCik(adet-1); // Eklenen elemanın değeri atasından büyükse yukarı taşınmalıdır.
    }
    void yukariCik(int no){ // parametre alınan 'no', heap'teki bir elemanın indisini tutar.
        int ustdal = (no-1)/2; // 'no' indisli elemanın ebeveyninin indisini hesaplayalım.
        while (ustdal >= 0 && dizi[ustdal].sayi < dizi[no].sayi){ // Eleman atasından büyük ise yer değiştirsin.
            Eleman ara = dizi[ustdal];
            dizi[ustdal]=dizi[no];
            dizi[no]=ara;
            no=ustdal; // no indisini ebeveyninin indisiyle günceller
            ustdal=(no-1)/2; // Ve yeni ebeveynin indeksini hesaplar.
        }
    }

    void heapGoster(){
        for (int i=0; i<adet; i++){
            System.out.print(dizi[i].sayi+" ");
        }
    }

    Eleman azamiDondur(){ // En büyük elemanı döndürme
        // Kök her zaman en büyük/en küçük değerdir.
        Eleman tmp = dizi[0]; // En büyük elemanı geçici bir değişkene atar.
        dizi[0] = dizi[adet-1]; // Heap'in son elemanını kök pozisyonuna taşıyalım.
        asagiIn(0); // : Bu satır, yeni kök elemanının heap özelliklerini koruyacak şekilde aşağı inmesini sağlar.
        adet--;
        return tmp;
    }

    void asagiIn(int no){
        // no indisli bir elemanın sağ ve sol çocuklarını hesaplayalım.
        int sol = 2*no+1;
        int sag = 2*no+2;
        while ((sol < adet && dizi[no].sayi < dizi[sol].sayi) ||
                (sag < adet && dizi[no].sayi > dizi[sag].sayi)){
            if(sag >= adet || dizi[sol].sayi > dizi[sag].sayi){ // sag >= adet koşulu, sağ çocuğun var olup olmadığını kontrol eder.
                Eleman ara = dizi[no];
                dizi[no]=dizi[sol];
                dizi[sol]= ara;
                no=sol;
            }
            else{
                Eleman ara = dizi[no];
                dizi[no]=dizi[sag];
                dizi[sag] = ara;
                no=sag;
            }
            sol=2*no+1;
            sag=2*no+2;

        }
    }
    
}
