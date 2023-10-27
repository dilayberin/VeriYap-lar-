package hafta4.lab;

public class main {
    public static void main(String[] args) {
        
            ciftBagliListe cbl =new ciftBagliListe();
              eleman e1=new eleman(3);
              eleman e2=new eleman(7);
              eleman e3=new eleman(2);
              cbl.basaEkle(e1);
              cbl.basaEkle(e2);
              String gelen= cbl.Listele();
              System.out.println(gelen);
          }
      }
    

