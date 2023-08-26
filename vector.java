package com.company;

import java.util.Arrays;
import java.util.*;

public class vector {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        //{100, 80, 60, 70, 60, 75, 85}
        int[] arr=new int[n];
        int[] arr1=new int[n];
        for (int i = 0; i <arr.length ; i++)
        {
         arr[i]= sc.nextInt();
        }
        for (int i = 0; i <arr1.length ; i++)
        {
            arr1[i]= sc.nextInt();
        }
        Arrays.sort(arr);
//        System.out.println(Arrays.toString(arr));
        int temp;
        for (int i = 0; i < arr1.length; i++) {
            for (int j = i+1; j < arr1.length; j++) {
                if(arr1[i] < arr1[j]) {
                    temp = arr1[i];
                    arr1[i] = arr1[j];
                    arr1[j] = temp;
                }
            }
        }
//        System.out.println(Arrays.toString(arr1));
        int sum=0;
        for (int i = 0; i <n ; i++)
        {
          sum=sum+(arr[i]*arr1[i]);
        }
        System.out.println(sum);









    }
}
