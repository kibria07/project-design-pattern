package creational.factory.design.pattern;

public class IphoneService extends DeviceService{
    @Override
    protected Device getPrice() {
        return new Iphone();
    }
}
