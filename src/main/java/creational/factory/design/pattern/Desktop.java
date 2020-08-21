package creational.factory.design.pattern;

public class Desktop implements Device {
    @Override
    public void displayPrice() {
        System.out.println("Desktop price is "+400);
    }
}
