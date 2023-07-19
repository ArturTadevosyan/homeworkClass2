package service;

import model.Shop;

import java.util.Scanner;

public class ShopService {

    public Shop create() {
        System.out.println("---- Create Shop ----");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Shop Name - ");
        String name = scanner.nextLine();

        System.out.print("Enter Shop address - ");
        String address = scanner.nextLine();

        System.out.print("Enter Shop Phone - ");
        String phone = scanner.nextLine();

        return new Shop(name, address, phone);
    }

}
