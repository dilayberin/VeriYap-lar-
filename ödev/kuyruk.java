/*
banka kuyruğu  örneğindeki yapıyı öncelikli kuyruk yapısına dönüştürünüz. banka işlemlerini kendi içerisinde
üç öncelik grubuna ayırınız.her yeni gelen kişiyi iş seçimine göre otomatik olarak ait olduğu grubun en sonuna ekle(enqueue)
her eleman alımında (dequeu)ise kuyruktaki en yüksek seviyeli grubun ilk elemanını alınız.

 */
package ödev;

/**
 *
 * @author dilay
 */
public class kuyruk {
    musteri[]dizi;
    int bas,son;
    int boyut,elemanSay=0;
      public kuyruk(int boyut) {
        dizi=new musteri[boyut];
        this.boyut=boyut;
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
        void ekle(musteri yeni){
        if(!doluMu()){
            dizi[son]=yeni;
            son=(son+1)%boyut;
        }
    }
            musteri sil(){
        musteri yedek;
        if(!bosMu()){
            yedek=dizi[bas];
            bas=(bas+1)%boyut;
            return yedek;
        }
    return null;
    }
}
