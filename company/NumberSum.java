package com.company;
import java.util.*;
public class NumberSum {
    public static int check(String temp) {
        int num = Integer.parseInt(temp+"");
        return num;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter your numbers ");
        String str = sc.nextLine();
        int i,sum=0;
        String temp="";
        for(i=0;i<str.length();i++) {
            temp=temp+str.charAt(i);
            if(str.charAt(i)==' '||i==str.length()-1) {
                sum = sum + check(temp.trim());
                temp="";
            }
        }
        System.out.println(sum);
    }
}

