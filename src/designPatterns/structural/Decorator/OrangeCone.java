package designPatterns.structural.Decorator;

public class OrangeCone implements IceCreamConstutients{
//    OrangeCone can be only used as Basic and not as add on as there is no IceCreamConstutients passed to its constructor

    @Override
    public int getCost() {

        return 20;
    }

    @Override
    public String getDescription() {

        return "OrangeCone";
    }
}
