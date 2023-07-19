package model;

public class Goods {
    private String name;
    private double weight;
    private String code;

    public Goods(String name, double weight, String code) {
        this.name = name;
        this.weight = weight;
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }


    public String toString() {
        return "Goods { " +
                "name = '" + name + '\'' +
                ", weight = " + weight +
                ", code = '" + code + '\'' +
                '}';
    }
}
