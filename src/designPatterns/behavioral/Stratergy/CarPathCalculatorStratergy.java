package designPatterns.behavioral.Stratergy;

public class CarPathCalculatorStratergy implements PathCalculatorStratergy {
    @Override
    public void findPath(String from, String To) {
        System.out.println("this is car path");
    }
}
