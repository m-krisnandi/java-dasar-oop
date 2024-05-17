package ecommerce.application;

import ecommerce.data.Customer;
import ecommerce.data.Level;

public class EnumApp {
    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.setName("Muhamad Krisnandi");
        customer.setLevel(Level.VIP);

        System.out.println(customer.getName());
        System.out.println(customer.getLevel());

        System.out.println(customer.getLevel().getDescription());

        // Convert Enum to String
        String levelName = Level.PREMIUM.name();
        System.out.println(levelName);

        // Convert String to Enum
        Level level = Level.valueOf("STANDARD");
        System.out.println(level);

        // Check All Enum
        System.out.println("Print Level");
        for (var value : Level.values()) {
            System.out.println(value);
        }
    }
}
