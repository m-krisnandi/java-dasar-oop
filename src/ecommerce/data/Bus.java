package ecommerce.data;

public class Bus implements Car {
    @Override
    public void drive() {
        System.out.println("Bus Drive");
    }

    @Override
    public int getTier() {
        return 7;
    }

    @Override
    public String getBrand() {
        return "Hino";
    }

    @Override
    public boolean isMaintenance() {
        return false;
    }

    @Override
    public boolean isBig() {
        return true;
    }
}
