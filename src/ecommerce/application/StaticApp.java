package ecommerce.application;

import static ecommerce.data.Application.PROCESSORS;
import static ecommerce.data.Constant.*;
import ecommerce.data.Country;
import ecommerce.util.MathUtil;

public class StaticApp {
    public static void main(String[] args) {
        System.out.println(APPLICATION);
        System.out.println(VERSION);

        System.out.println(
                MathUtil.sum(1,1,1,1,1)
        );

        Country.City city = new Country.City();
        city.setName("Bandung");
        System.out.println(city.getName());

        System.out.println(PROCESSORS);
    }
}
