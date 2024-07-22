
/*
baglı liste ile stack kullanımı
 */
package stack;



class eleman{
    int icerik;
    eleman ileri,geri;

    public eleman(int icerik) {
        this.icerik = icerik;
        ileri = null;
        geri = null;
    }

    
    
}

public class stack_1 {
    public static void main(String[] args) {
        stack_yigit y=new stack_yigit();
        eleman yeni=new eleman(9);
        y.push(yeni);
        yeni=new eleman(5);
        y.push(yeni);
        eleman sil=y.pop();
        if(sil!=null)
            System.out.println(sil.icerik);
        else
            System.out.println("stack bos");
    }
}
