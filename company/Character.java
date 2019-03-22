package com.company;

import java.util.Scanner;

public class Character {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any character");
        String str = sc.next();
        if (str.charAt(0) >= 65 && str.charAt(0) <= 92) {
            System.out.println("Capital letter");
        } else if (str.charAt(0) >= 97 && str.charAt(0) <= 122) {
            System.out.println("Small letter");
        } else {
            System.out.println("Number");
        }
    }
}
