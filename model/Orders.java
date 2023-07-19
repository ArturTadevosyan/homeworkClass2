package model;

public class Orders {

    private int id;
    private Shop shop;
    private Goods goods;
    private Customer customer;

    public Orders(int id, Shop shop, Goods goods, Customer customer) {
        this.id = id;
        this.shop = shop;
        this.goods = goods;
        this.customer = customer;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Shop getShop() {
        return shop;
    }

    public void setShop(Shop shop) {
        this.shop = shop;
    }

    public Goods getGoods() {
        return goods;
    }

    public void setGoods(Goods goods) {
        this.goods = goods;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public String toString() {
        return "Orders { " +
                "\n id = " + id +
                ",\n shop = " + shop +
                ",\n goods = " + goods +
                ",\n customer = " + customer +
                "\n}";
    }
}
