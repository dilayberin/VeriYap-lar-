/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hafta6calısmalar;

class dugum{
    int icerik;
    dugum ileri;

    public dugum(int icerik) {
        this.icerik=icerik;
        ileri=null;
    }
    
}
public class daireselBagliListe {
    dugum bas;

    public daireselBagliListe() {
        bas=null;
    }
    
    
    
    void basaEkle(dugum yeni){
       yeni.ileri=bas;
       if(bas!=null){
           dugum tmp=bas;
            while(tmp.ileri!=bas){
           tmp=tmp.ileri;
           
       }tmp.ileri=yeni;
            
       }
      
       else{
       yeni.ileri=yeni;
       bas=yeni;
        
      
       
    }}
    void sonaEkle(dugum yeni){
        
        if(bas==null){
            bas=yeni;
            bas.ileri=bas;
        }else{
            dugum tmp=bas;
            while(tmp.ileri!=bas){
                tmp=tmp.ileri;
        }
           tmp.ileri=yeni;
           yeni.ileri=bas;
           
    }}
    void Listele(){
        dugum tmp=bas;
        while(tmp.ileri!=bas){
            System.out.println(tmp.icerik);
            tmp=tmp.ileri;
        }
    }
    
}
