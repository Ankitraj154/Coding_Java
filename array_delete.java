package com.company;

import java.util.Scanner;

public class array_delete {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements in the array");
        int n=sc.nextInt();
        int [] arr=new int[n];
        System.out.println("Enter the elements in the array");
        for (int i = 0; i < arr.length ; i++)
        {
            arr[i]= sc.nextInt();
        }
        System.out.println("Enter the location where you wish to delete an element");
        int a= sc.nextInt();
        if(a<=arr.length)
        {
            for (int i = a-1; i < arr.length-1 ; i++)
            {
                arr[i]=arr[i+1];
            }
            System.out.println("Array after deletion is");
            for (int i = 0; i <arr.length-1 ; i++)
            {
                System.out.println(arr[i]);
            }
        }
        else {
            System.out.println("Invalid Input");
        }
    }

}
