package designPatterns.creational.Singleton.multiTread;

import java.util.concurrent.Semaphore;

public class Singleton{

    private static Singleton instance;
    private final int age;
    private final String name;

    private Singleton(){
        this.age=20;
        this.name="XYZ";
    }
    public static Singleton  createInstance(Semaphore S){
        if(instance==null){
            synchronized(Singleton.class){
                if(instance==null){
                    instance=new Singleton();
                }
            }
        }
        return  instance;
    }
}
