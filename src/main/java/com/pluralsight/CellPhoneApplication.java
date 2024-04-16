package com.pluralsight;

import java.sql.SQLOutput;
import java.util.Scanner;

public class CellPhoneApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CellPhone cp1;
        System.out.print("What is the serial number? ");
        int serialNumber = Integer.parseInt(scanner.nextLine());
        System.out.print("What model is the phone? ");
        String model = scanner.nextLine();
        System.out.print("Who is the carrier? ");
        String carrier = scanner.nextLine();
        System.out.print("What is the phone number? ");
        String phoneNumber = scanner.nextLine();
        System.out.print("Who is the owner of the phone? ");
        String owner = scanner.nextLine();

        cp1 = new CellPhone(serialNumber, model, carrier, phoneNumber, owner);

        System.out.println("Phone details:");
        System.out.println("Serial Number: " + cp1.getSerialNumber());
        System.out.println("Model: " + cp1.getModel());
        System.out.println("Carrier: " + cp1.getCarrier());
        System.out.println("Phone Number: " + cp1.getPhoneNumber());
        System.out.println("Owner: " + cp1.getOwner());

    }
}
