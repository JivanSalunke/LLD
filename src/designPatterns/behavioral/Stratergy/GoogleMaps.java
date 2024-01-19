package designPatterns.behavioral.Stratergy;

public class GoogleMaps {
    public static void main(String[] args) {
        PathCalculatorStratergy path= PathCalculatorFactory.getPathCalculatorBytype("bike");
        path.findPath("A","B");
    }
}
