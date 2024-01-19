package designPatterns.structural.Decorator;

public class StrawberryScoop implements IceCreamConstutients{
    private final IceCreamConstutients Ic;

    StrawberryScoop(IceCreamConstutients ic){
        this.Ic=ic;
    }
    @Override
    public int getCost() {
            return  Ic.getCost()+20;
    }

    @Override
    public String getDescription() {
            return Ic.getDescription()+" + StrawberryScoop";
    }
}
