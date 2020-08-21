package creational.builder.design.pattern;

public class UserBuilder implements Builder {

    private String userName;
    private String userEmail;
    private String userSSN;
    private int userAge;

    @Override
    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public void setUserEmail(String email) {
        this.userEmail = email;
    }

    @Override
    public void setUserSSN(String ssn) {
        this.userSSN = ssn;
    }

    @Override
    public void setUserAge(int age) {
        this.userAge = age;
    }

    public User getUserDetails(){
        return new User(userName,userEmail,userSSN,userAge);
    }


}
