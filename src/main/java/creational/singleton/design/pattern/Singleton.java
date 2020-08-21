package creational.singleton.design.pattern;

/*
  Singleton Pattern is a category of Creational pattern.

  Singleton design solution is where an application wants to have
  one and only one instance of any class.

  Please implement Singleton Design Pattern.

 */
public class Singleton {

    private static Singleton token = null;

    private Singleton() {
    }

    public static Singleton getInstance(){
        if(token==null){
            token= new Singleton();
        }
        return token;
    }
}
