package creational.builder.design.pattern;

public class TestDemo {

    public static void main(String[] args) {


        Director director = new Director();

        UserBuilder userBuilder = new UserBuilder();
        director.createUser(userBuilder);

        User user = userBuilder.getUserDetails();
        System.out.println("\nUser details information:\n"+ user.display());

    }
}
