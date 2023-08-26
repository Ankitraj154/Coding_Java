package com.company;

import java.util.Scanner;

public class class1 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Customer Address");
        System.out.println("Enter the street");
        String st1=sc.nextLine();
        System.out.println("Enter the city");
        String st2=sc.nextLine();
        System.out.println("Enter the pincode");
        int a =sc.nextInt();
        System.out.println("Enter the country");
        String st3=sc.next();

        class2 c2=new class2(st1,st2,a,st3);
        c2.displayAddress();
    }
}
