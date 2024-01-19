package designPatterns.behavioral.Observer;

public class GenerateInvoice implements OrderPlacedSubscriber{

    GenerateInvoice(){
        OrderPalcedPublisher flipkart=OrderPalcedPublisher.getInstance();
        flipkart.registerSubscriber(this);
    }
    @Override
    public void announce() {
        generateInvoice();
    }
    public void generateInvoice(){
        System.out.println("generating invoice");
    }
}
