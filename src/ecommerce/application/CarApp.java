package ecommerce.application;

import ecommerce.data.Car;
import ecommerce.data.Mercedes;

public class CarApp {
    public static void main(String[] args) {
        Car car = new Mercedes();
        System.out.println(car.getTier());
        car.drive();
        System.out.println(car.getBrand());
        System.out.println(car.isMaintenance());
    }
}
