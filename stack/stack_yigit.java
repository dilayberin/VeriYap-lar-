/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package stack;

import stack.eleman;


public class stack_yigit {
    eleman ust;
    public stack_yigit(){
        
    }
    boolean bosMu(){
        return ust==null;
    }
    void push(eleman yeni){
        yeni.ileri=ust;
        ust=yeni;
    }
    eleman pop(){
        eleman e=ust;
        if(!bosMu()){
            ust=ust.ileri;
            
        }
        return e;
    }
    void listele(){
       eleman yedek=ust;
       while(yedek!=null){
               System.out.println(yedek.icerik);
               yedek=yedek.ileri;
               }
}
}
