package com.company;
import java.util.*;
public class spam2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++)
        {
            arr[i]=sc.nextInt();
        }
        int[] temp = new int[7];
        temp[0]=1;
        for (int i = 1; i < n; i++) {
            temp[i] = 1;
            for (int j = i - 1; (j >= 0) && (arr[i] >= arr[j]); j--) {
                temp[i]++;
            }
        }
        for (int i = 0; i <temp.length ; i++)
        {
            System.out.println(temp[i]);
        }
    }
}
