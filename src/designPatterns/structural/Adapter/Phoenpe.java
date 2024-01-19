package designPatterns.structural.Adapter;

public class Phoenpe {
    BankAPIAdapter bankApi;

    Phoenpe(BankAPIAdapter bankApi){
        this.bankApi=bankApi;
    }

    int getAccountNumber(String name){
        return bankApi.getAccountNumber(name);
    }
}
