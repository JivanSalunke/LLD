package designPatterns.behavioral.Stratergy;

public class WalkPathCalculatorStratergy implements PathCalculatorStratergy{

    @Override
    public void findPath(String from, String To) {
        System.out.println("this is walk path");
    }
}
