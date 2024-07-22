/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tree;

class node{
   int value;
   node left,right;

    public node(int value) {
        this.value = value;
        left=null;
        right=null;
    }
   
}
public class tree {
    node root;
    

    public tree(node root) {
        root=null;
    }
    node Max(node n){
        node current=root;
        while(current!=null){
            current=current.right;
        }
        return current;
    }
    node Min(){
        node current=root;
        while(current!=null){
            current=current.left;
        }
        return current;
    }
    void delete(int data){
        root=del(root,data);
    }
    node del(node root,int data){
        node MaxLeft;
        if(root==null) return null;
        if(data<root.value) root.left=del(root.left, data);
        else if(data>root.value) root.right=del(root.right, data);
        else{
            if(root.left!=null && root.right!=null){  
                 MaxLeft=Max(root.left);
                 root.value=MaxLeft.value;
                 root.left=del(root.left,MaxLeft.value);
            }
            else if(root.left!=null) root=root.left;
            else if(root.right!=null) root=root.right;
            else root=null;
        }
        return root;
    }
    void add(node newNode){
        node y=null;
        node x=root;
        boolean isThere=false;
        while(x!=null){
            y=x;
            if(newNode.value < root.value) x=x.left;
            else if(newNode.value > root.value) x=x.right;
            else{
                isThere=true;
                break;
            }
        }
        if(!isThere){
            if(y==null) root=newNode;
            else{
                if(y.value<newNode.value) y.right=newNode;
                else if(y.value>newNode.value) y.left=newNode;
                else System.out.println("the number is on the tree");
            }
        }
    }
    
    public static void main(String[] args) {
         // Ağaç oluşturuluyor
        tree myTree = new tree(null);

        // Düğümler ekleniyor
        myTree.add(new node(10));
        myTree.add(new node(5));
        myTree.add(new node(15));
        myTree.add(new node(3));
        myTree.add(new node(7));
        myTree.add(new node(12));
        myTree.add(new node(18));

        // Ağacın içeriği yazdırılıyor
        System.out.println("Ağacın İlk Hali:");
        inorder(myTree.root);

        // Düğüm siliniyor
        int deleteValue = 10;
        myTree.delete(deleteValue);
        System.out.println("\n" + deleteValue + " değeri silindikten sonraki Ağaç:");
        inorder(myTree.root);
    }

    // Ağacı inorder olarak yazdırmak için kullanılan yardımcı metot
    private static void inorder(node root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.value + " ");
            inorder(root.right);
        }
    }
    }
      

