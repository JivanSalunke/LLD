package designPatterns.behavioral.Observer;

import java.util.ArrayList;

public class OrderPalcedPublisher {
    private ArrayList<OrderPlacedSubscriber> subscribers=new ArrayList<>();

    private static OrderPalcedPublisher instance;
    private OrderPalcedPublisher(){};
    public static OrderPalcedPublisher getInstance(){
        if(instance==null){
            instance= new OrderPalcedPublisher();
        }
        return instance;
    }
    public void orderPlaced(){
        for(OrderPlacedSubscriber subscriber:subscribers){
            subscriber.announce();
        }
    }
    public void registerSubscriber(OrderPlacedSubscriber subscriber){
        subscribers.add(subscriber);
    }

    public void unRegisterSubscriber(OrderPlacedSubscriber subscriber){
        subscribers.remove(subscriber);
    }
}
