package ecommerce.application;

import ecommerce.data.City;
import ecommerce.data.Location;

public class LocationApp {
    public static void main(String[] args) {
        // var location = new Location(); // Error karena abstract class
        var city = new City();
        city.name = "Bandung";

        System.out.println(city.name);
    }
}
