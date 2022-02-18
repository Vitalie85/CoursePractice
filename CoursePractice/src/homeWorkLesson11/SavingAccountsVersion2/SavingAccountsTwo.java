package homeWorkLesson11.SavingAccountsVersion2;

import homeWorkLesson11.SavingAccounts;

public class SavingAccountsTwo {
    private double savingsBalance;
    public String name;
    static double annualInterestRate;

    public SavingAccountsTwo() {
    }
    public SavingAccountsTwo(String name, double savingsBalance) {
        this.name = name;
        this.savingsBalance = savingsBalance;

        SavingAccountsTwo[] saver = new SavingAccountsTwo[2];
        saver[0] = new SavingAccountsTwo("saver1", 2000);
        saver[1] = new SavingAccountsTwo("saver2", 3000);
    }

    public SavingAccountsTwo(double annualInterestRate) {
        SavingAccountsTwo.annualInterestRate = annualInterestRate;

        SavingAccountsTwo[] rates = new SavingAccountsTwo[2];
        rates[0] = new SavingAccountsTwo(4);
        rates[1] = new SavingAccountsTwo(5);

    }


    private double calculateMonthlyInterest(double savingsBalance, double annualInterestRate) {
        return ((savingsBalance * annualInterestRate / 100) / 12);

    }

    private double getNewBalance(double monthlyInterest) {
        double newBalance = (monthlyInterest * 12) + savingsBalance;
        return newBalance;

    }

    public static void main(String[] args) {

        SavingAccountsTwo saving = new SavingAccountsTwo();

    }
}


