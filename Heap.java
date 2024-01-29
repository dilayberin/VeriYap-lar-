/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package heap;

class nokta{
    int icerik,ad;

    public nokta(int icerik, int ad) {
        this.icerik = icerik;
        this.ad = ad;
    }
    
}
public class HEAPCopy {
    nokta array[];
    int count;
    public HEAPCopy(int index) {
        array=new nokta[index];
        count=0;
    }
    boolean Empty(){
        return count==0;
    }
    void down(int index){
        int right,left;
        right=(2*index)+1;
        left=(2*index)+2;
        while(right<count&&array[right].icerik>array[index].icerik  ||  left<count&&array[left].icerik>array[index].icerik){
            if(right>=count || array[left].icerik>array[right].icerik){
                yerDegistir(index, left);
                index=left;
            }
            else{
                yerDegistir(index, right);
                index=right;
            }
            left=(index*1)+1;
            right=(index*1)+2;
        }
    }
    void up(int index){
         int upBranch;//üst dal
         upBranch=(index-1)/2;//üste çıkarılacak düğümün ebeveynini bulmayı sağlar.
         while(upBranch>=0 && array[index].icerik>array[upBranch].icerik){
             yerDegistir(upBranch, index);
             index=upBranch;
             upBranch=(index-1)/2;
         }
            }
    void yerDegistir(int k,int yeni){
        int eski=array[k].icerik;
        array[k].icerik=yeni;
        if(eski>yeni) down(k);
        else up(k);
    }
    static boolean isMaxHeap(int arr[],int index){
        for (int i = 0; i < (index-2)/2; i++) {
            if(arr[2*i+1]>arr[i]) return false;
            if(2*i+2<index&&arr[2*i+2]>arr[i]) return false;
        }
        return true;
    }
    
}
