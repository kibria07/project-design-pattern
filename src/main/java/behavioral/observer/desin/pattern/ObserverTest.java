package behavioral.observer.desin.pattern;

public class ObserverTest {

    public static void main(String[] args) {

        StockGrabber stockGrabber = new StockGrabber();

        StockObserver observer1 = new StockObserver(stockGrabber);

        stockGrabber.setBoaPrice(197.23);
        stockGrabber.setJpmcPrice(300.23);
        stockGrabber.setTeslaPrice(2100.23);
        stockGrabber.unRegister(observer1);

        observer1.printThePrices();
    }
}
