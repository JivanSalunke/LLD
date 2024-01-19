package designPatterns.structural.Adapter;

import designPatterns.structural.Adapter.ThirdPartyAPI.YesBankAPI;

public class YesBankAdapter implements BankAPIAdapter {
    private final YesBankAPI yes=new YesBankAPI();
    @Override
    public int getAccountNumber(String Name) {
        return yes.getAccountNumber("ABC");
    }

    @Override
    public double getAccountBalance(int Acc_No) {
        return 1000.34;
    }
}
