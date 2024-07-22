/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ornek;

class node{
    node left,right;
    int key,height;

    public node(int d) {
        key=d;
        height=1;
    }
    
}
class AVLTree{
    node root;
    int height(node n){
        if(n== null) return 0;
        return n.height;
           }
    int max(int a,int b){//sağ alt ağacın mı sol alt ağacın mı yüksekliği daha büyük
        if(a>b) return a;
        else return b;
    }
}
public class tree {
  
    node leftRotate(node x){
        node y=x.right;
        node T2=y.left;
        y.left=x;
        x.right=T2;
        x.height = max(x.left != null ? x.left.height : 0, x.right != null ? x.right.height : 0) + 1;


    }
}
