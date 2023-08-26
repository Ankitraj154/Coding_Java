package com.company;

public class test {
    public static void main(String[] args) {
        for (int i = 0; i <10 ; i++)
        {
            for (int j = 1; j <10 ; j++)
            {
              if(j==5)
              {
                  break;
              }
              else {
                  System.out.println(j);
              }
            }
            System.out.println(i);
        }
    }
}
