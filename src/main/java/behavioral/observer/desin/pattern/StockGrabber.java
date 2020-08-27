package behavioral.observer.desin.pattern;

import java.util.ArrayList;
import java.util.List;

public class StockGrabber implements Subject {
    //double jpmc, double boa, double tesla
    private double jpmcPrice;
    private double boaPrice;
    private double teslaPrice;

    private List<Observer>observer;

    public StockGrabber() {

        observer = new ArrayList<Observer>();
    }

    @Override
    public void register(Observer addObserver)
 {
        observer.add(addObserver);
    }

    @Override
    public void unRegister(Observer o) {
        int index = observer.indexOf(o);
        System.out.println("observer "+ (index+1)+" deleted");
        observer.remove(index);
    }

    @Override
    public void notifyObserver() {

        for(Observer st:observer){
            st.update(jpmcPrice,boaPrice,teslaPrice);
        }
    }

    public void setJpmcPrice(double jpmcPrice) {
        this.jpmcPrice = jpmcPrice;
        notifyObserver();
    }

    public void setBoaPrice(double boaPrice) {
        this.boaPrice = boaPrice;
        notifyObserver();
    }

    public void setTeslaPrice(double teslaPrice) {
        this.teslaPrice = teslaPrice;
        notifyObserver();
    }
}
