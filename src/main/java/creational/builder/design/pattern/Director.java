package creational.builder.design.pattern;

public class Director {

    public void createUser(Builder builder){
        builder.setUserName("john dao");
        builder.setUserAge(59);
        builder.setUserEmail("john78@gmail.com");
        builder.setUserSSN("562145623");
    }
}
