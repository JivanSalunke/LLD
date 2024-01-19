package designPatterns.structural.Decorator;

public class VanillaScoop implements IceCreamConstutients{

    IceCreamConstutients Ic;

    VanillaScoop(IceCreamConstutients Ic){
        this.Ic=Ic;
    }
    @Override
    public int getCost() {
            return this.Ic.getCost()+10;
    }

    @Override
    public String getDescription() {
            return this.Ic.getDescription()+" + VanillaScoop";
    }
}
