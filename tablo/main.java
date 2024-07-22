/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tablo;

class node{
    //bir key e bir isim e birde ilerisine ihtiyacımız var
    int key;
    String isim;
    node next;

    public node(int key, String isim) {
        this.key = key;
        this.isim = isim;
        next=null;
    }

    public node() {//for döngüsü içinde node içerisine parametre vermememiz gerekiyor. 
        //bu yüzden 2. const. oluşturduk
    }
    
    
}
class tablo{
    node dizi[];
    int size;

    public tablo( int size) {
        this.size = size;
        dizi=new node[size];
        for (int i = 0; i < size; i++) {
            dizi[i]=new node();
        }
    }
    int indexOlustur(int key){
        return key%size;
    }
    public void ekle(int key,String isim){
        int index=indexOlustur(key);
        node eleman=new node(key,isim);
        node yedek=dizi[index];
        while(yedek.next!=null){
            yedek=yedek.next;
        }
        yedek.next=eleman;
        System.out.println(eleman.isim+" "+ " eklendi");
    }
    
    public void elemanGoster(){/*
        0:ahmet-->mehmet
        1:ali
        2:null
        3:null
        4:null
        */
        for (int i = 0; i < size; i++) {
          if(dizi[i].next==null){
              System.out.println(i+".boş");
          }  
          else{
              System.out.print(i+":");
              node yedek=dizi[i].next;
              while(yedek!=null){
                  System.out.print(" "+yedek.isim);
                  yedek=yedek.next;
                  System.out.println("--->");
              }
          }
        }
    }
    
}
public class main {
    public static void main(String[] args) {
        tablo hashtablo=new tablo(5);
        hashtablo.ekle(2,"ahmet");
        hashtablo.ekle(12,"mehmet");
        System.out.println("--------------------->");
        hashtablo.elemanGoster();
    }
}
