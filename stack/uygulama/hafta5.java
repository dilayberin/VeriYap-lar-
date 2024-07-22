
package uygulama;
public class hafta5 {
    public static void main(String[] args) {
        BKI bki1=new BKI("dilay", 18, 58, 168);
       
        
        System.out.println("ad:"+" "+bki1.getIsım()+" "+" "+"boy kilo endeksi:"+" "+bki1.getBKI()+" "+"durumu:"+" "+bki1.getDurum());
        dersler d1=new dersler("veri yapıları");
       dersler d2=new dersler("algo");
       d1.ogrenciEkle("ali");
       d1.ogrenciEkle("veli");
       d2.ogrenciEkle("dilsy");
        System.out.println(d1.getDersAdı()+" "+d1.getOs());
   
    
       stack s=new stack();
        for (int i = 0; i < 10; i++) {
            s.ekle(i);
        }
        while(!s.bosmu())//false ise
        {
            System.out.println(s.cıkar()+" ");
        }    
    }
}
//classları burada çalıştırdık