/*
 * /*
banka kuyruğu  örneğindeki yapıyı öncelikli kuyruk yapısına dönüştürünüz. banka işlemlerini kendi içerisinde
üç öncelik grubuna ayırınız.her yeni gelen kişiyi iş seçimine göre otomatik olarak ait olduğu grubun en sonuna ekle(enqueue)
her eleman alımında (dequeu)ise kuyruktaki en yüksek seviyeli grubun ilk elemanını alınız.
 */
package ödev;

/**
 *
 * @author dilay
 */
public class main {
    public static void main(String[] args) {
        kuyruk paraCek=new kuyruk(1);
        kuyruk paraYukle=new kuyruk(1);
        kuyruk hesapAc=new kuyruk(1);
        musteri m1=new musteri("eda", "para çekme");
        musteri m2=new musteri("dilay", "para yukleme");
        musteri m3=new musteri("zeynep", "para yükleme");
        musteri m4=new musteri("bugre", "para cekme");
        musteri m5=new musteri("ahmet", "hesap acma");
        musteri m6=new musteri("berin", "para yukleme");
        musteri m7=new musteri("filiz", "hesap acma");
        musteri m8=new musteri("mehmet", "para cekme");
        musteri m9=new musteri("oğuz", "para yükleme");
       
        
        
        
        
        
        
        while(!paraCek.bosMu()||!paraYukle.bosMu()||!hesapAc.bosMu()){
            if(!paraYukle.bosMu()){
                paraYukle.sil();
                paraYukle.sil();
                paraCek.sil();
                hesapAc.sil();
            }else if(!paraCek.bosMu()){
                paraCek.sil();
                hesapAc.sil();
            }else{
                hesapAc.sil();
            }
            
        }
        
    }
}
