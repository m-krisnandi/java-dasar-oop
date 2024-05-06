package ecommerce.data;

public class Mercedes implements Car{
    @Override
    public void drive() {
        System.out.println("Mercedes AMG Drive");
    }

    @Override
    public int getTier() {
        return 1;
    }

    @Override
    public String getBrand() {
        return "Mercedes-Benz";
    }

    @Override
    public boolean isMaintenance() {
        return false;
    }
}
