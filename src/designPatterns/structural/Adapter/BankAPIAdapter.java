package designPatterns.structural.Adapter;

public interface BankAPIAdapter {
    int getAccountNumber(String Name);
    double getAccountBalance(int Acc_No);
}
