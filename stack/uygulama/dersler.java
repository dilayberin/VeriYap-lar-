
package uygulama;

public class dersler {
    private String dersinAdı;
    private String[]ogrenciler=new String[100];
    private int os;//ogrn sayısı
    public dersler(String dersinAdı){
        this.dersinAdı=dersinAdı;
    }
    public void ogrenciEkle(String ogrenci){
        ogrenciler[os]=ogrenci;
        os++;
    }
    public String[] getOgrenciler(){
        return ogrenciler;
        
    }
    public int getOs(){
        return os;
    }
    public String getDersAdı(){
        return dersinAdı;
    }
          
}
