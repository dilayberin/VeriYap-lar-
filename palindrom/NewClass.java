
package palindrom;


public class NewClass {
    public static void main(String[] args) {
        kuyruk kuyruk=new kuyruk(5);
        yıgıt yıgıt=new yıgıt(5);
        String s="DİLAY";
        for (int i = 0; i < s.length(); i++) {
            kuyruk.ekle(s.charAt(i));
            yıgıt.push(s.charAt(i));
        }
        yıgıt tmp;
        
    }
}
