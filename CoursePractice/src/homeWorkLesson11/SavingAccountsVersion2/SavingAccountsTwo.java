package homeWorkLesson11.SavingAccountsVersion2;

public class SavingAccountsTwo {
    private double savingsBalance;
    public String name;
    static double annualInterestRate;

    public SavingAccountsTwo(String name, double savingsBalance) {
        this.name = name;
        this.savingsBalance = savingsBalance;

        SavingAccountsTwo[] savingAccounts = new SavingAccountsTwo[2];
        savingAccounts[0] = new SavingAccountsTwo("saver1", 2000);
        savingAccounts[1] = new SavingAccountsTwo("saver2", 3000);
    }

    public SavingAccountsTwo (double annualInterestRate){
        SavingAccountsTwo.annualInterestRate = annualInterestRate;

        SavingAccountsTwo [] rates = new SavingAccountsTwo[2];
        rates [0] = new SavingAccountsTwo(4);
        rates [1] = new SavingAccountsTwo(5);
    }
}

