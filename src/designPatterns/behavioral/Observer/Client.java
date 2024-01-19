package designPatterns.behavioral.Observer;

public class Client {
    public static void main(String[] args) {
        OrderPalcedPublisher Flipkart= OrderPalcedPublisher.getInstance();
        GenerateInvoice IG= new GenerateInvoice();
        SendAppNotification AppNo= new SendAppNotification();

        Flipkart.orderPlaced();
    }

}
