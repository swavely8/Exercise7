package com.swavely.Week1;

public class Main {

    public static void main(String[] args) {
        Contact contact = new Contact ("Justin","swavely8@gmail.com");
        System.out.println(contact.toString());
        BusinessContact businessContact = new BusinessContact("Mr.K","mkillor@cscc.edu","614-501-1287");
        System.out.println(businessContact.toString());

    }
}