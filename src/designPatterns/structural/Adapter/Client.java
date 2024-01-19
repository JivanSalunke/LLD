package designPatterns.structural.Adapter;

public class Client {
    public static void main(String[] args) {
        Phoenpe YesPhonePe= new Phoenpe(new YesBankAdapter());
        System.out.println(YesPhonePe.getAccountNumber("ABC"));

        Phoenpe IciciPhonePe= new Phoenpe(new ICICIBankAdapter());
        System.out.println(IciciPhonePe.getAccountNumber("ABC"));


    }
}
