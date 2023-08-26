package com.company;

public class doubly_linklist {
    node1 head;
    //node1 tail;
    int size;
    doubly_linklist()
    {
        this.size=0;
    }

    public void add_at_first(int value)
    {
        node1 newnode= new node1();
        newnode.data=value;
        newnode.prev=null;
        if(head==null)
        {
            head= newnode;
            return;
        }
        newnode.next=head;
        head.prev=newnode;
        head=newnode;
        size++;

    }

    public void show()
    {
        node1 n1=head;
        while(n1 != null)
        {
            System.out.print(n1.data+"->");
            n1=n1.next;
        }
        System.out.println("Null");
    }

    public void add_at_last(int value)
    {
        node1 newnode= new node1();
        newnode.data=value;
        newnode.prev=null;
        if(head==null)
        {
         add_at_first(value);
         return;
        }
        node1 n=head;
        while(n.next!=null)
        {
          n=n.next;
        }
        newnode.next=null;
        n.next=newnode;
        newnode.prev=n;
        size++;
    }

    public void add_at(int index,int value)
    {
        if(index==0)
        {
           add_at_first(value);
            return;
        }

        node1 newnode= new node1();
        newnode.data=value;
        newnode.next=null;
        newnode.prev=null;
        node1 n=head;
       // node1 d=null;
        for (int i = 0; i <index-1 ; i++)
        {
            n=n.next;
        }

        newnode.next=n.next;
        newnode.prev=n;
        n.next=newnode;
        if(newnode.next!=null)
        {
            n.next.prev=newnode;
        }

        size++;
    }








    //function to print in reverse
//    public void reverse() {
//        node1 n1 = head;
//        node1 last=null;
//        while (n1 != null) {
//            System.out.print(n1.data + "->");
//            last = n1;
//            n1 = n1.next;
//        }
//        System.out.print("Null");
//        System.out.println();
////        while(last != null) {
////            System.out.print(last.data + "->");
////            last = last.prev;
////        }
////        System.out.print("null");



}
