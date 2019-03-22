package com.company;
import  java.util.*;

public class Pallendrome {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter any number ");
        long num = sc.nextLong();
        long rem = 0, rev = 0, sum = 0, originalnum = num, evennumsum = 0;
        while (num > 0) {
            rem = num % 10;
            if (rem % 2 == 0)
                evennumsum = evennumsum + rem;
            rev = rev * 10 + rem;
            num = num / 10;
        }
        if (rev == originalnum) {
            if (evennumsum > 25)
                System.out.println("number is pallindrome and the sum of the even numbers is greater than 25");
            else
                System.out.println("number is pallindrome and the sum of the even numbers is less than 25");
        } else {
            System.out.println("number is not pallindrome");
        }
    }
}
