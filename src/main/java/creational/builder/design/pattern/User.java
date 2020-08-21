package creational.builder.design.pattern;

/*
  Builder Design Pattern is a category of Creational pattern and it
  is a way to construct complex object.

  Below is the User class that have some private fields/attributes.

  Please implement Builder Design Pattern.

  To design this pattern, whatever number of classes needed, please feel free to
  implement those.
 */
public class User {
    private String userName;
    private String userEmail;
    private String userSSN;
    private int userAge;

    public User() {
    }

    public User(String userName, String userEmail, String userSSN, int userAge) {
        this.userName = userName;
        this.userEmail = userEmail;
        this.userSSN = userSSN;
        this.userAge = userAge;
    }

   /* public User(UserBuilder userBuilder){

    }*/

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserSSN() {
        return userSSN;
    }

    public void setUserSSN(String userSSN) {
        this.userSSN = userSSN;
    }

    public int getUserAge() {
        return userAge;
    }

    public void setUserAge(int userAge) {
        this.userAge = userAge;
    }

   /* public static class UserBuilder {

    }*/


    public String display() {
        return  "userName=" + userName +
                "\nuserEmail=" + userEmail +
                "\nuserSSN=" + userSSN  +
                "\nuserAge=" + userAge ;

    }
}
