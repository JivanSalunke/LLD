package designPatterns.structural.Adapter;

import designPatterns.structural.Adapter.ThirdPartyAPI.ICICBankAPI;

public class ICICIBankAdapter implements BankAPIAdapter {
    private final ICICBankAPI icici=new ICICBankAPI();
    @Override
    public int getAccountNumber(String Name) {
        String accNumber=icici.getAccNumber("ABC");
        return Integer.parseInt(accNumber);
    }

    @Override
    public double getAccountBalance(int Acc_No) {
        return 0;
    }
}
