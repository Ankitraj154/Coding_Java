package com.company;

public class call_for_doubly
{
    public static void main(String[] args)
    {
            doubly_linklist dl=new doubly_linklist();
            dl.add_at_first(1);
            dl.add_at_first(2);
            dl.add_at_first(3);
            dl.add_at_first(4);
            dl.add_at_first(5);
            dl.add_at_last(4);
//            dl.show();
            dl.add_at(6,40);
            dl.show();
           // dl.reverse();

    }
}
