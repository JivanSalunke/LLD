package designPatterns.behavioral.Stratergy;

public class BikePathCalculatorStratergy implements PathCalculatorStratergy{

    @Override
    public void findPath(String from, String To) {
        System.out.println("this is Bike Path");
    }
}
