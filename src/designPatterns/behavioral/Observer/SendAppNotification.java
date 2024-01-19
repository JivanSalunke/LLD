package designPatterns.behavioral.Observer;

public class SendAppNotification implements OrderPlacedSubscriber{
    SendAppNotification(){
        OrderPalcedPublisher flipkart=OrderPalcedPublisher.getInstance();
        flipkart.registerSubscriber(this);
    }
    @Override
    public void announce() {
        sendNotification();
    }
    public void sendNotification(){
        System.out.println("Sending In App Notification");
    }
}
