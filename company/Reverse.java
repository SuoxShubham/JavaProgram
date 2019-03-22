package com.company;

import java.util.Scanner;

public class Reverse {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter any string ");
        String str=sc.next();
        String temp="";
        int i;
        for(i=str.length()-1;i>=0;i--) {
            temp = temp+str.charAt(i);
        }
        System.out.println(temp);
    }
}
