package com.company;
import java.util.*;
public class NumberRepeat {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number ");
        int num = sc.nextInt();
        int i, j;
        for (i = 1; i <= num; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print(i);
            }
        }
    }
}
