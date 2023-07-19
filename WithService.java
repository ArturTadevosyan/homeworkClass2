import model.Customer;
import model.Goods;
import model.Orders;
import model.Shop;
import service.CustomerService;
import service.GoodsService;
import service.ShopService;

public class WithService {
    public static void main(String[] args) {

        // With Services
        ShopService shopService = new ShopService();
        GoodsService goodsService = new GoodsService();
        CustomerService customerService = new CustomerService();

        // Order 1
        Shop shop1 = shopService.create();
        Goods goods1 = goodsService.create();
        Customer customer1 = customerService.create();
        System.out.println(new Orders(1, shop1, goods1, customer1));

        System.out.println("----------------");

        // Order 2
        Shop shop2 = shopService.create();
        Goods goods2 = goodsService.create();
        Customer customer2 = customerService.create();
        System.out.println(new Orders(2, shop2, goods2, customer2));

    }
}
