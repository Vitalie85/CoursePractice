package homeWorkLesson11.SavingAccountsVersion2;

public class SavingAccountsTwo {
    private double savingsBalance;
    public String name;
    private static double annualInterestRate;

    public SavingAccountsTwo(String name, double savingsBalance) {
        this.name = name;
        this.savingsBalance = savingsBalance;
    }

    public double calculateMonthlyInterest() {
        savingsBalance += ((savingsBalance * annualInterestRate / 100) / 12);
        return savingsBalance;
    }

    public static void setAnnualInterestRate(double newRate) {
        annualInterestRate = newRate;
    }

    public static void main(String[] args) {
        SavingAccountsTwo[] savers = new SavingAccountsTwo[2];
        savers[0] = new SavingAccountsTwo("saver1", 2000);
        savers[1] = new SavingAccountsTwo("saver2", 3000);

        SavingAccountsTwo.setAnnualInterestRate(4);

        for (SavingAccountsTwo saver : savers) {
            System.out.println(saver.name + "-4%--" +saver.calculateMonthlyInterest());
        }

        SavingAccountsTwo.setAnnualInterestRate(5);

        for (SavingAccountsTwo saver : savers) {
            System.out.println(saver.name + "-5%--" +saver.calculateMonthlyInterest());
        }
    }
}