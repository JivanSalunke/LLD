package designPatterns.behavioral.Stratergy;

public class PathCalculatorFactory {

    public static PathCalculatorStratergy getPathCalculatorBytype(String Type){
        if(Type.equals("walk")){
            return  new WalkPathCalculatorStratergy();
        }else if(Type.equals("bike")){
            return  new BikePathCalculatorStratergy();
        }else{
            return  new CarPathCalculatorStratergy();
        }
    }
}
