/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hafta5uygulama;
import java.util.Stack;
/**
 *
 * @author dilay
 */
public class InfixToPostfix {
    


    static int oncelik(char karakter) {
        if (karakter == '^')
            return 3;
        else if (karakter == '*' || karakter == '/')
            return 2;
        else if (karakter == '+' || karakter == '-')
            return 1;
        else
            return -1;
    }

    static boolean isOperand(char karakter) {
        return (karakter >= 'a' && karakter <= 'z') ||
               (karakter >= 'A' && karakter <= 'Z') ||
               (karakter >= '0' && karakter <= '9');
    }

    static String infixToPostfix(String ifade) {
        String sonuc = "";
        Stack<Character> yigin = new Stack<>();

        for (int i = 0; i < ifade.length(); i++) {
            char mevcut = ifade.charAt(i);

            if (isOperand(mevcut)) {
                sonuc += mevcut;
            } else if (mevcut == '(') {
                yigin.push(mevcut);
            } else if (mevcut == ')') {
                while (!yigin.isEmpty() && yigin.peek() != '(') {
                    sonuc += yigin.pop();
                }
                if (!yigin.isEmpty() && yigin.peek() != '(') {
                    return "Geçersiz ifade";
                } else {
                    yigin.pop();
                }
            } else {
                while (!yigin.isEmpty() && oncelik(mevcut) <= oncelik(yigin.peek())) {
                    sonuc += yigin.pop();
                }
                yigin.push(mevcut);
            }
        }

        while (!yigin.isEmpty()) {
            sonuc += yigin.pop();
        }

        return sonuc;
    }

    public static void main(String[] args) {
        String infixIfade = "a-(b+c*d)/e";
        System.out.println("İnfix İfade: " + infixIfade);
        System.out.println("Postfix İfade: " + infixToPostfix(infixIfade));
    }
}










