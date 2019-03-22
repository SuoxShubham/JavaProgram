package com.company;
import java.util.*;
import java.util.Scanner;

public class EvenOdd {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number");
        int num = sc.nextInt();
        if (num % 2 == 0 && (num > 20 && num < 30)) {
            System.out.println("jerry");
        } else {
            System.out.println("Tom");
        }
    }
}
