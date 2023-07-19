package service;

import model.Customer;

import java.util.Scanner;

public class CustomerService {
    public Customer create(){
        System.out.println("---- Create Customer ----");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Customer Name - ");
        String name = scanner.nextLine();

        System.out.print("Enter Customer SureName - ");
        String sureName = scanner.nextLine();

        System.out.print("Enter Customer Email - ");
        String email = scanner.nextLine();

        System.out.print("Enter Customer Phone - ");
        String phone = scanner.nextLine();

        System.out.print("Enter Customer Address - ");
        String address = scanner.nextLine();

        return new Customer(name,sureName,email,phone,address);
    }

}
