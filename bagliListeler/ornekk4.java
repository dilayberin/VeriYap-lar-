package bagliListeler;
class eleman{
    int veri;
    eleman ileri;
    public eleman(int veri){
        this.veri=veri;
        ileri=null;
    }
}
class bListe{
    eleman ilk;
    eleman son;
    public bListe(){
       ilk=null;
       son=null;
    }
    public void sonaEKLE(eleman yeni){
        if(ilk==null){
            ilk=yeni;
            son=yeni;
        }else{
            son.ileri=yeni;
            son=yeni;        }
    }
    public String Listele(){
        String s=" ";
        eleman yedek=ilk;
        while(yedek!=null){
            s=s+yedek.veri+"-->";
            yedek=yedek.ileri;
        }
        System.out.println(s);
        return s;
    }
    public void basaEkle(eleman yeni){
        if(son==null){
            ilk=yeni;
            son=yeni;
        }else{
            yeni.ileri=ilk;
            ilk=yeni;
        }
    }}
public class ornekk4 {
    public static void main(String[] args) {
        bListe liste=new bListe();
        eleman e=new eleman(7);
        eleman e1=new eleman(5);
        eleman e2=new eleman(8);
        liste.sonaEKLE(e);
        liste.sonaEKLE(e1);
        liste.sonaEKLE(e2);
        eleman e3=new eleman(10);
        eleman e4=new eleman(45);
        liste.basaEkle(e3);
        liste.basaEkle(e4);
    }
}
