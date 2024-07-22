/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package palindrom;

/**
 *
 * @author dilay
 */
public class yıgıt {
   int[]dizi;
   int n;
   int ust;

    public yıgıt( int n) {
       dizi=new int[n];
        this.n = n;
        ust = -1;
    }
     boolean bosMu(){
        if(ust==-1){
            return true;
        }
        return false;
    
    }
    boolean doluMu(){
        if(ust==(n-1)){
            return true;
        }
        return false;
    
    }
    void push(char yeni){
        if(!doluMu()){
            ust++;
            dizi[ust]=yeni;
    }
        else{
            System.out.println("yığıt dolu"); 
        }}
    int pop(){
        if(!bosMu()){
           ust--; 
            System.out.println(dizi[ust]);
            return dizi[ust+1];
        }
        return -1;
    }
   
}
