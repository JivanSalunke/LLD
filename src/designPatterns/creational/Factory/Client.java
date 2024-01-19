package designPatterns.creational.Factory;

import designPatterns.creational.Factory.components.button.Button;

public class Client {
    public static void main(String[] args) {
        Flutter flutter= new Flutter();
        UIFactory factory= flutter.getFactory(SupportedPlatform.Android);

        Button button=factory.createButton();
        button.click();
    }
}
