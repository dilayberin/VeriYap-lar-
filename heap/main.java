/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package heaplab;

/**
 *
 * @author dilay
 */
public class main {
 static boolean heapMi(int[]dizi, int n){ // diziyi ve boyutunu parametre alsın
        /*
        Bu döngü, dizinin her elemanını kontrol eder.
        Döngü, dizinin boyutunun yarısına kadar devam eder çünkü bir
        heap’te her ebeveyn düğümünün iki çocuğu vardır ve bu çocuklar dizinin ikinci yarısında bulunur.
         */
      for (int i = 0; i < (n-2)/2; i++) {
            if(dizi[2*i+1] > dizi[i]){ //sol çoocuk > ebeveyn ise max-heap olamayacğı için false döndürür.
                return false;
            }
            if(2*i+2 < n && dizi[2*i+1] >dizi[i]){ // sağ çocuk var mı ve sağ cocuk > ebeveyn
                return false;
            }
        }
        return true;
    }


    static int [] heapsort(int[]dizi){
        int[] s = new int[dizi.length]; // Sıralanmış diziyi tutacak yeni bir dizi oluşturduk.
        Heapp h = new Heapp(dizi.length);
        /*
        Aşağıdaki for döngüsü, girdi dizisindeki her elemanı alır
        ve heap’e ekler. Her ekleme işleminden sonra,
        heap’in mevcut durumu gösterilir.
         */
        for (int i = 0; i <s.length; i++) { // dizinin  sonuna kadar git
            h.ekle(new Eleman (dizi[i])); // dizinin o anki indisindeki değeri yeni diziye ekle
            h.heapGoster();
            System.out.println(" ");
        }
        /*
        Aşağıdaki for döngüsü ise heap'teki en büyük elemanı çıkarır ve sıralanmış
        diziye ekler. Heap boş olana kadar bu işlem devam eder.
         */
            for (int i= 0; i <s.length; i++){
                s[i] = h.azamiDondur().sayi;
            }
        return s;
    }

    public static void main(String[] args) {
     Heapp h = new Heapp(20); // 20 elemana sahip yeni bir heap oluşturalım.
        // Heap'e elemanları ekleyelim.
        h.ekle(new Eleman(3));
        h.ekle(new Eleman(2));
        h.ekle(new Eleman(1));
        h.ekle(new Eleman(15));
        h.ekle(new Eleman(4));
        h.ekle(new Eleman(45));

        // Ekleme işleminden sonra mevcut durumu gösterelim
        h.heapGoster();
        System.out.println("-----------------------");

        int[] dizi = {90,15,10,7,12,2,7,3}; // Yeni bir dizi oluşturalım.
        int n = dizi.length; // Bu dizinin boyutunu n değişkenine atayalım
        if(heapMi(dizi,n)) // dizinin heap olup olmadığına bakar.
            System.out.println("Dizi heaptir.");
        else
            System.out.println("Dizi heap değildir.");
          /*
                  90
              15      10
             7  12   2  7
           3
         */
        System.out.println("-----------------------");

        int[] d = {15,23,44,55,67,48,32,95,2,8}; // Yeni bir dizi daha oluşturalım.
        int[] s = heapsort(d); // heapsort algoritması ile sıralar
        System.out.println("-----------------------");

        // Sıralanmış dizinin her elemanını ekrana yazdıralıms.
        for (int i = 0; i < s.length; i++) {
            System.out.print(s[i]+"-");
        }
        }

   
    
}
