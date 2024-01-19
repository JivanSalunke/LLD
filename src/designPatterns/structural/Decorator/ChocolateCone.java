package designPatterns.structural.Decorator;

public class ChocolateCone implements IceCreamConstutients{
    //    ChocolateCone can be used as basic as well as add on as IceCreamConstutients is passed to its constructor

    private IceCreamConstutients Ic;
        ChocolateCone(){}

    ChocolateCone(IceCreamConstutients Ic){
        this.Ic=Ic;
    }
    @Override
    public String getDescription() {
        if(this.Ic!=null){
            return  this.Ic.getDescription()+" + ChocolateCone";
        }
        return "ChocolateCone";
    }

    @Override
    public int getCost() {
        if(this.Ic!=null){
            return  Ic.getCost()+25;
        }
        return 25;
    }
}
