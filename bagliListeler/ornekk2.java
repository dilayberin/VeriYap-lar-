package bagliListeler;
class eleman{
    int icerik;
    eleman ileri;
    public eleman(int icerik){
        this.icerik=icerik;
        ileri=null;
    }
}
class liste{
    eleman bas;
    eleman son;
    public liste(){
        bas=null;
        son=null;
    }
    void basaEkle(eleman e){
        if(son==null){
            bas=e;
            son=e;
        }else{
            e.ileri=bas;
            bas=e;
        }
    }
}
public class ornekk2 {
    public static void main(String[] args) {
        liste l1=new liste();
        l1.basaEkle(new eleman(5));
        l1.basaEkle(new eleman(12));
        l1.basaEkle(new eleman(14));
        l1.basaEkle(new eleman(8));
        eleman tmp=l1.bas;
        while(tmp!=null){
            System.out.print(tmp.icerik+" "+"-->");
            tmp=tmp.ileri;
        }
    }
}
