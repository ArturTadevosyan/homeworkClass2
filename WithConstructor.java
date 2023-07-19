import model.Customer;
import model.Goods;
import model.Orders;
import model.Shop;

public class WithConstructor {
    public static void main(String[] args) {

        //With  Constructors
        Shop shop1 = new Shop("City", "Bangladesh 97/56", "+37494252195");
        Shop shop2 = new Shop("Apple", "Komitas 97/56", "+37477331495");

        Goods goods1 = new Goods("IPhone 13 Pro Max", 0.6, "254687445");
        Goods goods2 = new Goods("Bread", 0.2, "254687445");

        Customer customer1 = new Customer(
                "Artur",
                "Tadevosyan",
                "arturtadevosyan926@gmail.com",
                "+37477214931",
                "Minas Papyan 24/23"
        );

        Customer customer2 = new Customer(
                "Alina",
                "Hunanyan",
                "alina926@gmail.com",
                "+37494881144",
                "Arno Babaganyan 53/2"
        );

        Orders orders1 = new Orders(1, shop1, goods1, customer1);
        Orders orders2 = new Orders(2, shop2, goods2, customer2);

        System.out.println(orders1);
        System.out.println("----------------");
        System.out.println(orders2);


    }
}
