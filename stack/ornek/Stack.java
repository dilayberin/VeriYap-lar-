/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ornek;

/**
parantez kontrol etme
 */
public class Stack {
    int size;
    int indis;
    char[] dizi;

    public Stack(int size) {
        this.size=size;
        indis=0;
        this.dizi=new char[size];
    }
    public boolean isFull(){
        if(indis==size){
            return true;
        }
        else
            return false;
    }
    public boolean isEmpty(){
        return indis==0;
    }
    public void push(char eklenen){
       if(!isFull()){
           dizi[indis]=eklenen;
           indis++;
       } else{
           System.out.println("stack dolu");
       }
       
    }
    public char pop(){
        if(!isEmpty()){
           char i= dizi[indis-1];
           indis--;
           return i;//çıkan elemanı döndürdük
        }else{
             System.out.println("stack boş"); 
                }
        return 0;//dolu değilse 0 döndürebilir.
    }
    
}
