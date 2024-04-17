package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CellPhone cp1 = new CellPhone();
        CellPhone cp2 = new CellPhone();

        System.out.print("What is the serial number? ");
        cp1.setSerialNumber(Integer.parseInt(scanner.nextLine()));
        System.out.print("What model is the phone? ");
        cp1.setModel(scanner.nextLine());
        System.out.print("Who is the carrier? ");
        cp1.setCarrier(scanner.nextLine());
        System.out.print("What is the phone number? ");
        cp1.setPhoneNumber(scanner.nextLine());
        System.out.print("Who is the owner of the phone? ");
        cp1.setOwner(scanner.nextLine());

        cp2.setSerialNumber(2597153);
        cp2.setModel("iPhone 15 Pro Max");
        cp2.setCarrier("Verizon");
        cp2.setPhoneNumber("888-555-1234");
        cp2.setOwner("Sandra");

        display(cp1);
        display(cp2);
        cp1.dial(cp2.getPhoneNumber());
        cp2.dial(cp1.getPhoneNumber());

    }

    public static void display(CellPhone phone) {
        System.out.println(phone.getOwner() + "'s phone details:");
        System.out.println("Serial Number: " + phone.getSerialNumber());
        System.out.println("Model: " + phone.getModel());
        System.out.println("Carrier: " + phone.getCarrier());
        System.out.println("Phone Number: " + phone.getPhoneNumber());
        System.out.println("Owner: " + phone.getOwner());
    }

}
