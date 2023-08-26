package com.company;
import java.util.*;
public class span {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
          int[] arr={100,120,160,100,50,80,150};

//        int[] arr = new int[n];
//        for (int i = 0; i < arr.length; i++)
//        {
//            arr[i]=sc.nextInt();
//        }
        int[] temp = new int[7];
        int count=1;
        temp[0]=1;
        for (int i = 1; i <arr.length ; i++)
        {
            if(arr[i]<arr[i-1])
            {
                temp[i]=count;
            }
            else if (arr[i]>arr[i-1])
            {
                for (int j =i-1; j>=0; j--)
                {
                   if( arr[i]>arr[j]) {
                       count++;
                   }
                   else if(arr[i]<arr[j])
                   {
                     break;
                   }
                }
                temp[i]=count;
                count=1;
            }
        }
        for (int i = 0; i <temp.length ; i++)
        {
            System.out.print(temp[i]+" ");
        }

    }

}
