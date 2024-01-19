package designPatterns.creational.Singleton.singleThread;
public class Singleton {
    private static Singleton obj;
    private final int age;
    private final String name;
    private Singleton(){
        this.age=10;
        this.name="abc";
    }

    public static Singleton create(){
        if(obj==null) {
            obj= new Singleton();
        }
        return  obj;
    }
}
