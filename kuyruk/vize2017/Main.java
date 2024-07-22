/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vize2017;

import java.util.Stack;

public class Main {

    public static void siraliYap(Stack<Integer> yigit) {
        if (yigit.isEmpty() || yigit.size() == 1) {
            // Yığıt zaten sıralı veya boş ise işlem yapmaya gerek yok.
            return;
        }

        Stack<Integer> geciciYigit = new Stack<>();
        geciciYigit.push(yigit.pop());

        while (!yigit.isEmpty()) {
            int eleman = yigit.pop();

            // Yığıtın tepesindeki elemandan küçük olanları atla
            while (!geciciYigit.isEmpty() && eleman > geciciYigit.peek()) {
                geciciYigit.pop();
            }

            // Küçük veya eşit olanları gecici yığıta ekle
            geciciYigit.push(eleman);
        }

        // Yığıtı temizle
        yigit.clear();

        // Gecici yığıtı orijinal yığıta ekleyerek sıralı hale getir
        while (!geciciYigit.isEmpty()) {
            yigit.push(geciciYigit.pop());
        }
    }

    public static void main(String[] args) {
        Stack<Integer> yigit = new Stack<>();
        yigit.push(4);
        yigit.push(20);
        yigit.push(15);
        yigit.push(15);
        yigit.push(8);
        yigit.push(5);
        yigit.push(7);
        yigit.push(12);
        yigit.push(3);
        yigit.push(10);
        yigit.push(5);
        yigit.push(0);

        System.out.println("Önceki Yığıt: " + yigit);

        siraliYap(yigit);

        System.out.println("Sıralı Yığıt: " + yigit);
    }
}

