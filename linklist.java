package com.company;

class node {
    int data;
    node next;
}

public class linklist {

    node head;
    node tail;
    int size;
    linklist()
    {
        this.size=0;
    }


    public void add_at_first(int value)      // Add at first position
    {
        node newnode = new node();
        newnode.data=value;
        newnode.next=null;
        newnode.next=head;
        head=newnode;
        if(tail==null)
        {
            tail=head;
        }
        size++;
    }


    public void add_at_last(int value)       // Add at last position
    {
        if(tail==null)
        {
            add_at_first(value);
            return;
        }
        node newnode = new node();
        newnode.data=value;
        tail.next=newnode;
        newnode=tail;
        size++;
    }



    public void insert_at(int index,int value)  // Add at any position
    {
        node newnode = new node();
        newnode.data=value;

        if(index==0)
        {
            add_at_first(value);
            return;
        }
        if(index==size)
        {
            add_at_last(value);
            return;
        }
        node n=head;
        for (int i = 0; i <index-1 ; i++)
        {
            n=n.next;
        }
        newnode.next=n.next;
        n.next=newnode;
        size++;
    }


    public void show()             // print all data in link list
    {
        node n=head;
        while(n!=null)
        {
            System.out.print(n.data+"->");
            n=n.next;
        }
        System.out.print("null");
        System.out.println();
    }
    public void sizeof()
    {
        System.out.println(size);
    }



    public void delete_at_first()       // delete at first
    {
        if(tail==null)
        {
            System.out.println("list impty");
            return;
        }
        head=head.next;
        size--;
    }

    public void delete_at_last()      // delete at last
    {
        if(size<=1)
        {
            delete_at_first();
            return;
        }
        if(head.next==null)
        {
            head=null;
            return;
        }
        node secondlast=head;
        node last=head.next;
        while(last.next!=null)
        {
             last=last.next;
            secondlast=secondlast.next;
        }
      //  secondlast=null;
        size--;
    }


    public void delete_at(int index)     // delete at any position
    {
        if (tail==null)
        {
            System.out.println("list is empty");
            return;
        }
        if(index==0)
        {
            delete_at_first();
            return;
        }
        node n=head;
        node temp;
        for (int i = 0; i <index-1 ; i++)
        {
            n=n.next;
        }
        temp=n.next;
        n.next=temp.next;

        size--;
    }


    public int search(int value)     // search value present or not
    {
        int count=0;
        node n=head;
        while(n!=null)
        {
           if(n.data==value)
           {
               return count;
            //    System.out.println("found");
           }
           count++;
          n=n.next;
        }
          // System.out.println("Not found");
        return -1;
    }


    public void update(int index,int value)
    {
        if(head==null)
        {
            System.out.println("list is empty");
            return;
        }
        if(index==0)
        {
            node newnode= new node();
            newnode.data=value;
            newnode.next=null;
            newnode.next=head.next;
            head=newnode;
            return;

        }
        node newnode= new node();
        newnode.data=value;
        newnode.next=null;
        node n=head;
        node temp;
        for (int i = 0; i <index-1 ; i++)
        {
            n=n.next;
        }
        temp=n.next;
        newnode.next=temp.next;
        n.next=newnode;
    }
    public void remove_duplicate()
    {
       node n=head;
       while(n.next!=null)
       {
          if(n.data==n.next.data)
          {
              n.next=n.next.next;
          }
          else
          n=n.next;
       }
//       tail=n;
//       tail=null;
   }

   public boolean cycle_check()
   {
       node slow=head;
       node fast=head;
       int count=0;

       while(fast!=null&&fast.next!=null)
       {
           slow=slow.next;
           fast=fast.next.next;
           if (fast==slow)
           {
               count++;
           }
       }


return false;
   }

}

