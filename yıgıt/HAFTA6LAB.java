/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package yıgıt;


/**
 *
 * @author dilay
 */
public class HAFTA6LAB {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       String s="abc$cba";
       yigitK yigit=new yigitK();
       int i=0;
       boolean tanirMi=true;
       while(i<s.length()&&s.charAt(i)!='$'){
           yigit.push(new eleman(s.charAt(i)));//karakter tipide bir değişken istiyor.
           i++;
       }
       if(i<s.length()&&s.charAt(i)=='$'){
           i=i+1;
           while(!yigit.bosMu()){
               eleman e=yigit.pop();
               if(e.icerik!=s.charAt(i)){
                   tanirMi=false;
                   break;
               }
               i++;
               if(i==s.length()&&!yigit.bosMu()){//yıgıta atılan elemanla kontrol edilen eleman sayısını eşitlemesi gerekti
                   tanirMi=false;
                   break;
               }
           }
           if(tanirMi) System.out.println("dil ifadeyi tanıdı");
           else System.out.println("dil ifadeyi tanımadı");
       }
    }
    
}
