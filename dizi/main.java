/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dizi;

/**
 *
 * @author dilay
 */
public class main {
    public static void main(String[] args) {
        kuyruk kuyruk=new kuyruk(5);
        ogrenci yeni=new ogrenci(123, "ali");
        ogrenci yeni2=new ogrenci(245,"veli");
        kuyruk.ekle(yeni);
        kuyruk.ekle(yeni2);
        kuyruk.listele();
        kuyruk.sil();
        kuyruk.listele();
        
    }
}
