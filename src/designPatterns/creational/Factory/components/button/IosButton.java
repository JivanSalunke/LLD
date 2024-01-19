package designPatterns.creational.Factory.components.button;

public class IosButton implements  Button{

    public void click(){
        System.out.println("clicked ios button");
    }
}
