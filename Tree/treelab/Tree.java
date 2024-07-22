/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package treelab;

/**
 *
 * @author dilay
 */
public class Tree {
    node kok;
    public Tree(node kok) {
        kok=null;
    }
    
    void ekle(node yeni){
        node yer=null;
        node x=kok;
        while(x!=null){
            yer=x;
            if(yeni.icerik<x.icerik) x=x.sol;
            else x=x.sağ;
        }
        if(yer==null) kok=yeni;
        else if(yeni.icerik<yer.icerik) yer.sol=yeni;
        else yer.sağ=yeni;
    }   
    void prerder(node node){
        if(node==null) return ;
        System.out.println(node.icerik+" ");
        prerder( node.sol);
        prerder(node.sağ);
    }
    void inorder(node node){
        if(node==null) return;
        inorder (node.sol);
        System.out.println(node.icerik+" ");
        inorder(node.sağ);
    }
    void postorder(node node){
        if(node==null) return;
        postorder (node.sol);
        System.out.println(node.icerik+" ");
        postorder(node.sağ);
    }
    node minBul(){
        node sonuc=kok;
        while(sonuc.sol!=null){
            sonuc=sonuc.sol;
        }
        return sonuc;
    } 
    node maxBul(){
        node sonuc=kok;
        while(sonuc.sağ!=null){
            sonuc=sonuc.sağ;
        }
        return sonuc;
    }
    node arama(int eleman){
        node d=kok;
        while(d!=null){
            if(d.icerik==eleman){
                System.out.println("eleman bulundu");
                return d;
            }
            else if(d.icerik>eleman){
                d=d.sol;
                
            }
            else d=d.sağ;
        }
        System.out.println("eleman bulunamadı...");
        return d;
        
    }
    public boolean yaprakSil(int key){
        node cyrrent=kok;
        node parent=kok;//bulunan değerden bir önceki değişkeni tutar.
        boolean solDugum=true;
        while (cyrrent.icerik!=key) {            
            parent=cyrrent;
            if(key<cyrrent.icerik){
                solDugum=true;
                cyrrent=cyrrent.sol;
            }
            else{
                solDugum=false;
                cyrrent=cyrrent.sağ;
            }
            if(cyrrent==null) return false;
        }
        if(cyrrent.sol==null && cyrrent.sağ==null){
            if(cyrrent==kok){
                kok=null;
            }
            else if(solDugum) {
                parent.sol=null;
                
            }
            else parent.sağ=null;
            return true;
        }
        else return false;
        
}
    public int findHeight(node root,int sayac) {
    if (root == null) {
        return sayac;
    } else {
        int leftHeight = findHeight(root.sol,sayac+1);
        int rightHeight = findHeight(root.sağ,sayac+1);
        return Math.max(leftHeight, rightHeight);
    }
}
   
    public static void main(String[] args) {
        Tree agac = new Tree(null);
        agac.ekle(new node(5));
        agac.ekle(new node(3));
        agac.ekle(new node(7));
        agac.ekle(new node(1));
        agac.ekle(new node(4));
        agac.ekle(new node(6));
        agac.ekle(new node(8));
        agac.ekle(new node(9));
        System.out.println("Ağacın yüksekliği: " + agac.findHeight(agac.kok,0));
    }


    }
    
