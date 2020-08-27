package behavioral.observer.desin.pattern;

public interface Subject {

    void register(Observer o);
    void unRegister(Observer o);
    void notifyObserver();
}
