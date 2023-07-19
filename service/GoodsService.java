package service;

import model.Goods;

import java.util.Scanner;

public class GoodsService {
    public Goods create() {
        System.out.println("---- Create goods ----");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Goods Name - ");
        String name = scanner.nextLine();

        System.out.print("Enter Goods Weight - ");
        double weight = scanner.nextDouble();

        System.out.print("Enter Goods Code - ");
        scanner.nextLine();
        String code = scanner.nextLine();

        return new Goods(name, weight, code);
    }
}
