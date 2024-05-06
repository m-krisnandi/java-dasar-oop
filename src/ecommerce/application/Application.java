package ecommerce.application;

import ecommerce.data.Product;

public class Application {
    public static void main(String[] args) {
        Product product = new  Product("Macbook Pro", 30_000_000);
        System.out.println(product.name);
        System.out.println(product.price);
    }
}
