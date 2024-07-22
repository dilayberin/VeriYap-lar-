/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kuyruk;

/**
 *
 * @author dilay
 */
public class main {
    public static void main(String[] args) {
        kuyruk k=new kuyruk();
        dugum yeni=new dugum(6);
        dugum yeni2=new dugum(7);
        k.ekle(yeni);
        k.ekle(yeni2);
        k.sil();
        k.listele();
    }
}
