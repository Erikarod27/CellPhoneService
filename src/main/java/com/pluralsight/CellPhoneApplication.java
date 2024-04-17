package com.pluralsight;

import java.sql.SQLOutput;
import java.util.Scanner;

public class CellPhoneApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CellPhone cp1 = new CellPhone();

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

        System.out.println("Phone details:");
        System.out.println("Serial Number: " + cp1.getSerialNumber());
        System.out.println("Model: " + cp1.getModel());
        System.out.println("Carrier: " + cp1.getCarrier());
        System.out.println("Phone Number: " + cp1.getPhoneNumber());
        System.out.println("Owner: " + cp1.getOwner());

    }

}
