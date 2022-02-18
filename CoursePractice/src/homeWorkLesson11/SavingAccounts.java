package homeWorkLesson11;

public class SavingAccounts {
    static double annualInterestRate;
    private double savingsBalance;

    public SavingAccounts() {
    }

    private double calculateMonthlyInterest(double savingsBalance, double annualInterestRate) {
        return ((savingsBalance * annualInterestRate/100) / 12);
    }
    private double getNewBalance(double monthlyInterest){
        double newBalance = (monthlyInterest * 12) + savingsBalance;
        return newBalance;
    }

    public static void main(String[] args) {
        double monthlyInterest;

        SavingAccounts saver1 = new SavingAccounts();
        SavingAccounts saver2 = new SavingAccounts();

        saver1.savingsBalance = 2000;
        saver2.savingsBalance = 3000;
        SavingAccounts.annualInterestRate = 4;

        double newBalanceSaver1;

        monthlyInterest = saver1.calculateMonthlyInterest(saver1.savingsBalance, SavingAccounts.annualInterestRate);
        newBalanceSaver1 = saver1.getNewBalance( monthlyInterest);

        System.out.println(" Monthly interest for saver1: "  + String.format("%.2f",monthlyInterest)+" USD/month,  new ballance: " + newBalanceSaver1 );

        SavingAccounts.annualInterestRate = 5;

        monthlyInterest = saver1.calculateMonthlyInterest(newBalanceSaver1, SavingAccounts.annualInterestRate);

        newBalanceSaver1 = saver1.getNewBalance( monthlyInterest);

        System.out.println(" Monthly interest for saver1, after raising interest rate: "  + String.format("%.2f",monthlyInterest)+" USD/month,  new ballance: " + newBalanceSaver1 );
        }
    }
