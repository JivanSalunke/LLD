package designPatterns.creational.Factory;

public class PracticalFactory {

    UIFactory getUIFactory(SupportedPlatform platform){
        return switch (platform){
            case Ios -> new IosUIFactory();
            case Android -> new AndroidUIFactory();
        };
    }
}
