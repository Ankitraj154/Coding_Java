package com.company;
import java.util.*;

public class median {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements in the array");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the elements in the array");
        for (int i = 0; i <arr.length ; i++)
        {
           arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        if(n%2==0)
        {
          double a=(double)(arr[arr.length/2]+arr[(arr.length/2)-1])/2;
            System.out.printf("The median of the array is %.2f",a);
        }
        else {
            double b1=arr[(n+1)/2-1];


            System.out.printf("The median of the array is %.2f", b1);
        }
    }
}
