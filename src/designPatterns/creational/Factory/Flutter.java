package designPatterns.creational.Factory;

public class Flutter {

    public  void setTheme(){
        System.out.println("Theme set to default");
    }
    public UIFactory getFactory(SupportedPlatform platform){
//        if(platform=="Android"){
//            return new AndroidUIFactory();
//        }else{
//            return new IosUIFactory();
//        }

//        practical Factory
        PracticalFactory factory=new PracticalFactory();
        return  factory.getUIFactory(platform);
    }
}
