
package uygulama;
//boy kilo endeksi bulan bir uygulama
class BKI{
    private String isim;
    private int yas;
    private double kilo;
    private double boy;
    public static final double kpp=0.4535923;
    public static final double mpi=0.0254; 
    public BKI(String isim,int yas,double kilo,double boy){
        this.isim=isim;
        this.yas=yas;
        this.boy=boy;
        this.kilo=kilo;
    }
    public BKI(String isim,double boy,double kilo){
        this(isim, 20, kilo, boy);
    }
    public BKI(){}
     
    public double getBKI(){
       double bki=kilo*kpp/(boy*mpi)*(boy*mpi);
       return Math.round(bki*100)/100.0;
    }
    public String getDurum(){
        double bki=getBKI();
        if(bki<18.5){
            return "zayıf";
            
        }
        else if(bki>=18.5&&bki<=25){
            return "orta kilolu";
        }
        else
            return "obez";
    }
    public String getIsım(){return isim;}
     public int getYas(){return yas;}
      public double getBoy(){return boy;}
       public double getKılo(){return kilo;}
}

public class Haftabesuygulama {

    public static void main(String[] args) {
        
    }
    
}
