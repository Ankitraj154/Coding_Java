package com.company;

public class class2 {
    String street;
    String city;
    int pincode;
    String country;
     class2(String street,String city,int pincode,String country)
    {
       this.street=street;
       this.city=city;
       this.pincode=pincode;
       this.country=country;
    }
    void displayAddress()
    {
        System.out.println("Street: "+street);
        System.out.println("City: "+city);
        System.out.println("Pincode: "+pincode);
        System.out.println("Country "+country);
    }
}
