package designPatterns.structural.Decorator;

public class Sprinklers implements IceCreamConstutients{
    private final IceCreamConstutients Ic;

    Sprinklers(IceCreamConstutients ic){
        this.Ic=ic;
    }

    @Override
    public int getCost() {
        return Ic.getCost()+10;
    }

    @Override
    public String getDescription() {
        return Ic.getDescription()+" + Sprinklers";
    }
}
