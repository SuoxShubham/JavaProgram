package com.company;

import java.util.Scanner;

public class Sort {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter any number ");
        String str=sc.next();
        int arr[]= new int[str.length()];
        int i,j,temp=0;
        for(i=0;i<str.length();i++) {
            arr[i]=Integer.parseInt(str.charAt(i)+"");
        }
        for(i=0;i<arr.length;i++) {
            for(j=0;j<arr.length-i-1;j++) {
                if(arr[j]<arr[j+1]) {
                    temp=arr[j];
                    arr[j]= arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        int sum=0;
        for(i=0;i<arr.length;i++) {
            if(arr[i]%2==0) {
                sum =sum +arr[i];
            }

            System.out.print(arr[i]);
        }
        if(sum>15)
            System.out.print(" sum is "+sum+" True ");
        else
            System.out.print(" sum is "+sum+" false ");
    }
}
