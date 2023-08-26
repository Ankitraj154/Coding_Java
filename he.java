package com.company;
import java.util.*;
//3,7,15,31,63,...
public class he {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        int [] check=new int[n];
        int count=0;
        for (int i = 0; i <arr.length; i++)
        {
            arr[i]=sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++)
        {
            int j=0;
            for (j = 0; j <i; j++)
            {
                if(arr[i]==arr[j])
                {
                   break;
                }
            }
            if(i==j)
            {
                count++;
            }

        }
        System.out.println(count);
    }
}
