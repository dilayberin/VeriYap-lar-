/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package yıgıt;

/**
 *
 * @author dilay
 */
public class yigitK {
    eleman ust;

    public yigitK() {
        ust=null;
    }
    boolean bosMu(){
       return ust==null;
    }
    void push (eleman yeni){
        yeni.ileri=ust;
        ust=yeni;
    }
    eleman pop(){
        eleman e=ust;
        if(!bosMu()){
            ust=ust.ileri;
        }
        return e;//çıkarılan eleman
    }
    
}
