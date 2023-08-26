package com.company;

class nodep{
    int data;
    nodep next;

}


public class p1Linklit
{
    nodep head;
    int size;
    p1Linklit(){
        this.size=0;

    }

    void addfirst(int value)
    {
       nodep n1= new nodep();
       n1.data =value;
       n1.next=null;
       n1.next=head;
       head=n1;
       size++;
    }
    void add(int value)
    {
        nodep np=head;
        nodep n1= new nodep();
        n1.data=value;
        n1.next=null;
        if(head==null)
        {
            addfirst(value);
            return;
        }
        while(np.next!=null)
        {
            np=np.next;
        }
        np.next=n1;

//        np.next=n1;
//        n1.next=null;

        size++;

    }
    void show()
    {
        nodep np=head;
        while(np!=null)
        {
            System.out.print(np.data+"->");
            np=np.next;
        }
        System.out.print("null");
        System.out.println();
//        node n=head;
//        while(n!=null)
//        {
//            System.out.print(n.data+"->");
//            n=n.next;
//        }
//        System.out.print("null");
//        System.out.println();
   }
     void sizeof()
    {
        System.out.println(size);
    }

    void addat(int value,int position)
    {
        nodep n1=new nodep();
        n1.data=value;
        n1.next=null;
        nodep np=head;
        for (int i = 0; i <position-2 ; i++)
        {
            np=np.next;
        }
        n1.next=np.next;
        np.next=n1;
        size++;

    }
    void deletef1()
    {
        nodep np=head;
        head=np.next;
        size--;
    }

    void deletelast()
    {
        nodep np=head;
        while(np.next.next!=null)
        {
            np=np.next;
        }
        np.next=null;
        size--;

    }
    void deleteat(int index)
    {
        nodep np=head;
        nodep temp;
        for (int i = 0; i <index-2 ; i++)
        {
            np=np.next;
        }
        temp=np.next;
        np.next=temp.next;
        size--;

    }
    void deletelasty()
    {
        nodep np=head;
        while(np.next.next!=null)
        {
            np=np.next;
        }
        np.next=null;
        size--;
    }

    public static void main(String[] args) {
        p1Linklit p1=new p1Linklit();
       // p1.addfirst(45);
       // p1.addfirst(1);
        p1.add(7);
        p1.add(718);
        p1.add(378);
        p1.add(787);
        p1.add(780);
        p1.addat(10,3);
        p1.show();
        p1.sizeof();
        p1.deletef1();

        p1.show();
        p1.sizeof();
        p1.deletelast();
        p1.show();
        p1.sizeof();
        p1.deleteat(3);
        p1.show();
        p1.sizeof();
        p1.deletelasty();
        p1.show();
        p1.sizeof();
    }
}

