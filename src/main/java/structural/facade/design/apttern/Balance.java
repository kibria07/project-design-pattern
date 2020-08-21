package structural.facade.design.apttern;

public class Balance {

    private double balance=100.00;

    public double getCurrentBalance() {
        if(balance <0)
            return -1;
        return  balance;
    }



}
