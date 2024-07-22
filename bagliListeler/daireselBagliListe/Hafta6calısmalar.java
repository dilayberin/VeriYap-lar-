/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package daireselBagliListe;

/**
 *
 * @author dilay
 */
public class Hafta6calısmalar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        daireselBagliListe a=new daireselBagliListe();
        dugum d1=new dugum(8);
        dugum d2=new dugum(10);
        dugum d3=new dugum(15);
        dugum d4=new dugum(4);
        a.basaEkle(d1); 
        a.basaEkle(d2);
        a.sonaEkle(d3);
        a.basaEkle(d4);
        a.Listele();
}
}