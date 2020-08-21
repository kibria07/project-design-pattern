package structural.facade.design.apttern;

/*
  Facade Design Pattern is a category of Structural pattern.

  The Facade pattern is appropriate when we have a complex system that we want to expose to clients
  in a simplified way.

  Please implement Facade Design Pattern.

  To design this pattern, whatever number of classes needed, please feel free to
  implement those.

 */
public class BankStatement {

    public static void main(String[] args) {

        CustomerInfo customerInfo = new CustomerInfo();
        Balance balance = new Balance();
        Statement statement = new Statement(customerInfo, balance);
        statement.getBankStatement();

    }
}
