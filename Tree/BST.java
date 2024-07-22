/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author dilay
 */
class Dugum {
    int anahtar;
    Dugum sol, sag;

    public Dugum(int item) {
        anahtar = item;
        sol = sag = null;
    }
}

 public class BST {
    Dugum kok;

    int agacYukseklik(Dugum dugum) {
        if (dugum == null)
            return 0;
        else {
            int solYukseklik = agacYukseklik(dugum.sol);
            int sagYukseklik = agacYukseklik(dugum.sag);

            return Math.max(solYukseklik, sagYukseklik)+1;
        }
    }


     public static void main(String[] args) {
        BST agac = new BST();
        agac.kok = new Dugum(10);
        agac.kok.sol = new Dugum(5);
        agac.kok.sag = new Dugum(15);
        agac.kok.sol.sol = new Dugum(2);
        agac.kok.sol.sag = new Dugum(7);
        agac.kok.sag.sag = new Dugum(20);

        int yukseklik = agac.agacYukseklik(agac.kok);
        System.out.println("Binary Search Tree'nin yüksekliği: " + yukseklik);
    }

}
