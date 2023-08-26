package com.company;
import java.sql.SQLOutput;
import java.util.*;
public class one_it {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String st=sc.nextLine();
        String s="";

        for (int i = 0; i <st.length() ; i++) {
            if(st.charAt(i)=='A'||st.charAt(i)=='E'||st.charAt(i)=='I'||st.charAt(i)=='O'||st.charAt(i)=='U')
            {
                continue;
            }
            s=s+st.charAt(i);

        }
        System.out.println(s);

    }

}
