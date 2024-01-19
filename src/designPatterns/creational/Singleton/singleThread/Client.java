package designPatterns.creational.Singleton.singleThread;

public class Client {
    public static void main(String[] args) {
        Singleton A=Singleton.create();
        Singleton B=Singleton.create();

        System.out.print("Debuuug");
    }
}
