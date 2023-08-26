package com.company;
import java.util.*;
public class mode {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements in the array");
        int n=sc.nextInt();
        int [] arr=new int[n];
        System.out.println("Enter the elements in the array");
        for (int i = 0; i <arr.length ; i++)
        {
        arr[i]= sc.nextInt();
        }
        int max_count=0;
        int count=1;
        int value=0;
        for (int i = 0; i <arr.length ; i++)
        {
            for (int j = i+1; j <arr.length-1 ; j++)
            {
                if(arr[i]==arr[j])
                {
                    count++;
                    value=arr[i];

                }
                if(count>max_count)
                {
                    max_count=count;
                    value=arr[i];
                }
            }

        }
        if (max_count==1)
        {
            System.out.println("The mode of the array is none");
        }
        else {
            System.out.println("The mode of the array is ");
            System.out.println(value);
        }

    }
}
