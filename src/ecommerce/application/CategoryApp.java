package ecommerce.application;

import ecommerce.data.Category;

public class CategoryApp {
    public static void main(String[] args) {
        var category = new Category();
        category.setId("ID-001");

        System.out.println(category.getId());
    }
}
