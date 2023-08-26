package com.company;

import java.util.*;

public class string_manipulation
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int[][]arr =new int[a][b];
        int sum=0;
        int colsum=0;
        for (int i = 0; i <a ; i++)
        {
            for (int j = 0; j <b ; j++)
            {
                arr[i][j]=sc.nextInt();
            }

        }

        System.out.println("the matrix is");
        for (int i = 0; i <a; i++) {
            for (int j = 0; j <b ; j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }


        for (int i = 0; i <a ; i++)
        {
            for (int j = 0; j <b ; j++)
            {
                    sum=sum+arr[i][j];

            }
            System.out.println("Row "+(i+1)+" sum is "+sum);
            sum=0;
        }

        for (int j = 0; j <b ; j++)
        {
            for (int i = 0; i <a ; i++)
            {
                colsum=colsum+arr[i][j];

            }
            System.out.println("column "+(j+1)+" sum is "+colsum);
            colsum=0;
        }








//        StringBuffer sb= new StringBuffer();
//        String st=sc.nextLine();
//        String stnew=st.trim();
//        System.out.println(stnew);
//        String[] s = stnew.split("\\s+");
//        for (int i = 1; i< s.length ; i++)
//        {
//            s[i]=s[i].toUpperCase();
//        }
//        String output=String.join(" ",s);
//        System.out.println(output);
//        for (int i = 0; i <s.length ; i++)
//        {
//            sb.append(s[i]);
//        }
//        String out=Arrays.toString(s);
//        System.out.println(out);
//        String st2=sc.next();
//        System.out.println("The length of the first string is "+st.length());
//        System.out.println("The length of the second string is "+st2.length());
//        System.out.println(" The uppercase of the first string is "+st.toUpperCase());
//        System.out.println(" The uppercase of the first string is "+st2.toUpperCase());
//        System.out.println("The concatenated string is "+st.concat(st2));
//      //  boolean a=st.equalsIgnoreCase(st2);
//        int a=st.compareTo(st2);
//        System.out.println(a);
//
//        if(a<0)
//        {
//            System.out.println(st+" appears before "+st2);
//        }
//        else if (a==0){
//            System.out.println("Both the input strings are the same");
//        }
//        else
//        {
//            System.out.println(st2+" appears before "+st);
//        }

    }
}
//    The length of the first string is 4
//
//        The length of the second string is 5
//
//        The uppercase of the first string is WERE
//
//        The uppercase of the second string is APPLE
//
//        The concatenated string is wereapple
//
//        apple appears before were
//
//To compare 2 strings --- The function returns 0 if the 2 strings are the same, returns -1 if the first string is less
// than the second string, and returns 1 if the first string is greater than the second string.