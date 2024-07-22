/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package palindrom;


public class kuyruk {
    int[]dizi;
    int n;
    int son;

    public kuyruk(int n) {
        this.n=n;
        dizi=new int[n];
        son=-1;
        
    }
    boolean bosMu(){
        return son==-1;
    }
    boolean doluMu(){
        return son==n-1;
    }
    void ekle(char x){
        if(!doluMu()){
            son+=1;
            dizi[son]=x;
        }
        else System.out.println("kuyruk dolu");
    }
    int sil(){
        if(!bosMu()){
            int cıkan=dizi[0];
            for (int i = 1; i <= son; i++) {
               dizi[i-1]=dizi[i]; 
            }
            son=son-1;
            return cıkan;
        }
        else{
            System.out.println("kuyruk boş");
        }
        return -1;
    }
}
