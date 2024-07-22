/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bankaUygulaması;

/**
 *
 * @author dilay
 */
public class main {
    public static void main(String[] args) {
        kuyruk k=new kuyruk(5);
        String isim="ali";
        int isuresi=3;
        int bsuresi;
        if(k.bosMu()){
            bsuresi=0;
        }else{
            int son=k.son;
            bsuresi=k.dizi[son-1].beklemeSuresi+k.dizi[son-1].islemSuresi;
                    
        }
        musteri m=new musteri(isim,isuresi,bsuresi);
        System.out.println(m.isim+"-"+m.islemSuresi+"-"+m.beklemeSuresi);
    }
}
