package com.company;

import java.util.Scanner;

public class StringRepeatation {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the string ");
        String str = sc.next();
        System.out.println("enter the number ");
        int num = sc.nextInt();
        String con = str.substring(str.length()-num);
//        String temp="";
        int i;
        for(i=1;i<=num;i++) {
            str = str+con;
        }
        System.out.println(str);
    }
}
