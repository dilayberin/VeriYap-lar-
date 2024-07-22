/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uygulama;

public class stack {
    private int[] eleman;
    private int size;
    public static final int dc=16;
    public stack(){
    this(dc);}
    public stack (int c){eleman=new int[c];}
    public void ekle (int deger){
        if (size>=eleman.length){
            int []temp=new int[eleman.length*2];
            System.arraycopy(eleman, 0, temp, 0, eleman.length);
            eleman =temp;
        }
        eleman[size++]=deger;
    }
    public int cıkar(){return eleman[--size];}
    public int peek(){return eleman[size-1];}
    public boolean bosmu(){return size==0;}
    public int getSize(){return size;}
}
