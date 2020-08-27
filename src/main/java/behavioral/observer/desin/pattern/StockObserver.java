package behavioral.observer.desin.pattern;

public class StockObserver implements Observer {

    private double jpmcPrice;
    private double boaPrice;
    private double teslaPrice;

    private static int observerIdTracker =0;
    private int observerID;
    private Subject stockGrabber;

    public StockObserver(Subject stockGrabber) {
        this.stockGrabber = stockGrabber;
        this.observerID = ++observerIdTracker;
        System.out.println("new observer "+this.observerID);
        stockGrabber.register(this);

    }

    @Override
    public void update(double jpmcPrice, double boaPrice, double teslaPrice) {

        this.jpmcPrice=jpmcPrice;
        this.boaPrice=boaPrice;
        this.teslaPrice=teslaPrice;

        printThePrices();
    }


    public void printThePrices(){
        System.out.println(observerID +" JPMC: "+jpmcPrice +" BOA: "+ boaPrice+" tesla: "+teslaPrice);
    }
}
