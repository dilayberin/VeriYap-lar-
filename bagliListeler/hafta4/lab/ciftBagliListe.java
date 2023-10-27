package hafta4.lab;

public class ciftBagliListe {
    eleman bas,son;

    public ciftBagliListe() {
        bas = null;
        son = null;
    }
    public void basaEkle(eleman yeni){
        if(bas==null){
            bas=yeni;
            son=yeni;
        }else{
            yeni.ileri=bas;
            bas.geri=yeni;
            bas=yeni;
        }
    }
    String Listele(){
        eleman yedek=son;
        String liste="";
        while(yedek!=null){
            liste+=yedek.sayı+"-->";
            yedek=yedek.ileri;
        }
        return liste;
    }
    public void sonaEkle(eleman yeni){
        if(bas==null){
            bas=yeni;
            son=yeni;
        }else{
            yeni.geri=son;
            son.ileri=yeni;
            son=yeni;
        }
    }
    public void bastanSil(){
        if(bas.ileri==null){///yalnız bir eleman varsa
            son=null;
        }
        else{
            bas.ileri.geri=null;
            bas=bas.ileri;
            
        }
    }
    public void sondanSil(){
        if(bas.ileri==null){
            bas=null;
        }
        else{
            son.geri.ileri=null;
            son=son.ileri;
        }
    }
    
}
