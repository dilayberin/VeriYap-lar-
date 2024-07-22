/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kuyruk;

/**
 *
 * @author dilay
 */
public class kuyruk {
    dugum bas,son;

    public kuyruk() {
        bas=null;
        son=null;
    }
    boolean bosMu(){
       return bas==null;
    }
    void ekle(dugum yeni){
        if(bosMu()){
            bas=yeni;
            son=yeni;
            
        }else{
            son.ileri=yeni;
            son=yeni;
        }
    }
    dugum sil(){
        dugum sonuc=bas;
        if(!bosMu()){
            bas=bas.ileri;
            if(bas==null){
                son=null;
            }
           
            
        }
         return sonuc;
    }
    
    void listele(){
        dugum yedek=bas;
        while(yedek!=null){
            System.out.println(yedek.icerik);
            yedek=yedek.ileri;
        }
    }

    
    
}
