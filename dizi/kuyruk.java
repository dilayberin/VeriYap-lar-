/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dizi;

/**
 *
 * @author dilay
 */
public class kuyruk {
    ogrenci []dizi;//ogrenci sınıfından bir dizi
    int bas,son;
    int boyut;

    public kuyruk( int boyut) {
       this.boyut=boyut;
       dizi=new ogrenci[boyut];
       bas=0;
       son=0;
       
    }
    boolean doluMu(){
        return bas==(bas+1)%boyut;
    }
    boolean bosMu(){
        return bas==son;// bas==(bas+1)%boyut bu yapıdan dolayı tek eleman olma durumu düşünelemez.bas ve son ilkj başta 0. 
                        //esitlerse yani 0 larsa boştur.
    }
    void ekle(ogrenci yeni){
        if(!doluMu()){
            dizi[son]=yeni;
            son=(son+1)%boyut;
        }
    }
    ogrenci sil(){
        ogrenci yedek;
        if(!bosMu()){
            yedek=dizi[bas];
            bas=(bas+1)%boyut;
            return yedek;
        }
    return null;
    }
    void listele(){
        if(bosMu()){
            System.out.println("kuyruk boş");
        }
        int index=bas;
        while(index!=son){
          if(dizi[index]!=null){  
              System.out.println("--"+dizi[index].no+", "+dizi[index].isim+"--");
    }
    index=index+1;
}
}}