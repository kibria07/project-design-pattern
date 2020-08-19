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

    public User(UserBuilder userBuilder){

    }

    public String getUserName() {
        return userName;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public String getUserSSN() {
        return userSSN;
    }

    public int getUserAge() {
        return userAge;
    }


    public static class UserBuilder {

    }
}
