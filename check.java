package com.company;

import java.util.Scanner;

public class check {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] arr1 = new int[n];
        int flag = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = sc.nextInt();
        }
        if (arr.length == arr1.length)
        {
            for (int i = 0; i < arr.length; i++)
            {
                if (arr[i] >= arr1[i]) {
                    flag ++;
                }
            }
            if (flag == n) {
                System.out.println("Compatible");
            } else {
                System.out.println("Incompatible");
            }
        }

    }
}