package com.company;

import java.util.Scanner;

public class star {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();

        int i = 0, j = 0;

        while (i < a) {
            j = 0;
            while (j < a) {
                if (i < j) {
                    j++;
                    continue;
                }
                System.out.print("* ");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
