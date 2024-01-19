package designPatterns.structural.Decorator;

public class Client {
    public static void main(String[] args) {
        IceCreamConstutients Icecream=
                new Sprinklers(
                    new VanillaScoop(
                            new Sprinklers(
                                    new StrawberryScoop(
                                            new ChocolateCone(
                                                    new OrangeCone()
                                            )
                                    )
                            )
                    )
                );

        System.out.println(Icecream.getCost());
        System.out.println(Icecream.getDescription());
    }
}
