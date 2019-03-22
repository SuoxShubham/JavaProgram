package com.company;

import java.util.Scanner;

public class VowelConsonant {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your word");
        String str = sc.next();
        String vowel = "AEIOUaeiou";
        String num = "0123456789";
        int i, j, c = 0, l = 0;
        for (i = 0; i < str.length(); i++) {
            c = 0;
            l = 0;
            for (j = 0; j < vowel.length(); j++) {
                if (str.charAt(i) == vowel.charAt(j)) {
                    c = 1;
                }
            }
            for (j = 0; j < num.length(); j++) {
                if (str.charAt(i) == num.charAt(j)) {
                    l = 1;
                }
            }
            if (l == 1) {
                System.out.println("please enter a string");
            } else if (c == 1) {
                System.out.println("vowel");
            } else {
                System.out.println("consonant");
            }
        }
    }
}
