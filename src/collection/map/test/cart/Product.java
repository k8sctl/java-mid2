package collection.map.test.cart;

import java.util.Objects;

public class Product {

    private String name;
    private int pirce;

    Product(String name, int pirce) {
        this.name = name;
        this.pirce = pirce;
    }

    @Override
    public boolean equals(Object object) {
        if (object == null || getClass() != object.getClass()) return false;
        Product product = (Product) object;
        return pirce == product.pirce && Objects.equals(name, product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, pirce);
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", pirce=" + pirce +
                '}';
    }
}
