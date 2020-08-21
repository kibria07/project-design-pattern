package creational.factory.design.pattern;

public class PhoneService extends DeviceService{
    @Override
    protected Device getPrice() {
        return new Phone();
    }
}
