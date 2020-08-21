package structural.facade.design.apttern;

public class Statement {

    private CustomerInfo customerInfo;
    private Balance balance;

    public Statement(CustomerInfo customerInfo, Balance balance) {
        this.customerInfo = customerInfo;
        this.balance = balance;
    }

    public void setCustomerInfo() {
        customerInfo.setAccountNumber("423912546");
        customerInfo.setFirstName("John");
        customerInfo.setLastName("Kirk");
        customerInfo.setAddress("619 john street");
        customerInfo.setCity("Brooklyn");
        customerInfo.setZipcode("11230");
        customerInfo.setCountry("USA");
        customerInfo.setStatement("Electronic");
    }

    public void getBankStatement() {
        setCustomerInfo();
        System.out.println("account number is :"+customerInfo.getAccountNumber());
        customerInfo.getAddress();
        customerInfo.getFirstName();
        customerInfo.getLastName();
        customerInfo.getZipcode();
        customerInfo.getCountry();
        customerInfo.getStatement();
        balance.getCurrentBalance();
    }
}
