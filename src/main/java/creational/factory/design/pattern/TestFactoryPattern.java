package creational.factory.design.pattern;

public class TestFactoryPattern {

    public static void main(String[] args) {
        DeviceService deviceService = new PhoneService();
        deviceService.getPrice().displayPrice();


        deviceService = new IphoneService();
        deviceService.getPrice().displayPrice();
    }
}
