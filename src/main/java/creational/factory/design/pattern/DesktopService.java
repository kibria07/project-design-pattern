package creational.factory.design.pattern;

public class DesktopService extends DeviceService{
    @Override
    protected Device getPrice() {
        return new Desktop();
    }
}
