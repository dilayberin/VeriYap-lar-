/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package avltree;
class dugum{
    int icerik,yukseklik;
    dugum sağ,sol;

    public dugum(int d) {
        icerik=d;
        yukseklik=1;
    }
}
class avlTree{
   dugum kok;
   
   int height(dugum n){
      if(n==null) return 0;
      return n.yukseklik;
   }
   int max(int a,int b){
       return (a>b) ? a:b;//a>b ise a yı döndür,değilse b yi döndür
   }
   int getBalance(dugum n){//gelen düğümün solu ile sağı dengeli mi bu ölçülür.
       if(n==null) return 0;
       return height(n.sol)-height(n.sağ);
   }
   dugum sagaDondur(dugum y){
       dugum x=y.sol;
       dugum T2=x.sağ;//yedek
       x.sağ=y;
       y.sol=T2;
       y.yukseklik=max(height(y.sol),height(y.sağ))+1;//bize güncellenmemiş halini getiriyordu.o yüzden +1 ekledik
       x.yukseklik=max(height(x.sol),height(x.sağ))+1;
       return x;//yeni kök x olacaktır.
   }
   dugum solaDondur(dugum x){
       dugum y=x.sağ;
       dugum T2=y.sol;//yedek
       y.sol=x;
       x.sağ=T2;
       x.yukseklik=max(height(x.sol),height(x.sağ))+1;
       y.yukseklik=max(height(y.sol),height(y.sağ))+1;
       return y;//yeni kök y olacaktır.
   }
   dugum insert(dugum node,int icerik){//rekürsif
       if(node==null) return (new dugum(icerik));
       if(icerik<node.icerik) node.sol=insert(node.sol, icerik);
       else if(icerik>node.icerik) node.sağ=insert(node.sağ,icerik);
       else return node;
       //buraya kadar yapılan işlemler aynı ikili arama ağacındaki gibi ekleme işlemidir.
       
       node.yukseklik=1+max(height(node.sol),height(node.sağ));
       
       int balance=getBalance(node);
       //sol-sol dengesizliği
       if(balance>1&&icerik<node.sol.icerik) return sagaDondur(node);//birbirinden bağımsız kodlar olmasını istediğimiz için if-if şeklinde baktık.
       //sağ-sağ dengesizliği
       if(balance<-1&&icerik<node.sağ.icerik) return solaDondur(node);
       //sol-sağ dengesizliği
       if(balance>1&&icerik<node.sol.icerik) {
           node.sol=solaDondur(node.sol);
           return sagaDondur(node);
       }
       //sağ-sol dengesizliği
       if(balance<-1&&icerik<node.sağ.icerik) {
           node.sağ=sagaDondur(node.sağ);
           return solaDondur(node);
       }
       return node;
       
   } 
   void search(int eleman){
        dugum tmp=kok;
        boolean varMi=false;
        while(tmp!=null){
          if(tmp.icerik==eleman){
              varMi=true;
              break;
          }
          else if(tmp.icerik<eleman) tmp=tmp.sağ;
          else tmp=tmp.sol;
        }
        if(varMi==true){
           /* kok.icerik=tmp.icerik;
            System.out.println(kok.icerik);
            System.out.println(kok.sol.icerik);
            System.out.println(kok.sağ.icerik);*/
            preorder(tmp);
        }
         else System.out.println("eleman yok..");
      
    } 
   void preorder(dugum node){
       if(node!=null){
           System.out.println(node.icerik + " ");
           preorder(node.sol);
           preorder(node.sağ);
       }
   }
}
public class örnek {

    public static void main(String[] args) {
     avlTree tree=new avlTree();                                             
     tree.kok=tree.insert(tree.kok,10);                           
     tree.kok=tree.insert(tree.kok,20);                      
     tree.kok=tree.insert(tree.kok,30);
     tree.kok=tree.insert(tree.kok,40);
     tree.kok=tree.insert(tree.kok,50);
     tree.kok=tree.insert(tree.kok,25);
     tree.preorder(tree.kok);
        System.out.println("---");
     tree.search(10);
     
    }
    
}