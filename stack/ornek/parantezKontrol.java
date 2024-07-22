/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ornek;

/**
 *
 * @author dilay
 */
public class parantezKontrol {
   private String input;//sadece bu sınıf için kullanılsın

    public parantezKontrol(String input) {
        this.input = input;//bir yerde parantezkontrol çağırılırsa iiçine bu dizge atılsın
    }
    public void check(){
        int size=this.input.length();//{a(b)a}için 7 elemanlı bir stack yapacak
        Stack stack=new Stack(size);
        for (int i = 0; i < this.input.length(); i++) {
            char ch=this.input.charAt(i);
            switch (ch) {
                case '{',']','(':
                    stack.push(ch);
                    break;
                case '}','[',')':
                    if(!stack.isEmpty()){
                        char ch2=stack.pop();
                        if((ch=='}'&&ch2=='{' ) ||  (ch==']'&&ch2=='[') || (ch==')'&&ch2=='(')){//}a{b)c( hatalıdır. bu durumu engellemek için
                            System.out.println("hata:"+ch+"parantezinde"+ i +"indisinde");
                            return;
        }
                    }else{
                        System.out.println("hata:"+ch+"parantezinde"+ i +"indisinde");
                    }
            }
            
        
    }

   
   
    
}
