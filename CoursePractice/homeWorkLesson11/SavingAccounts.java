package homeWorkLesson11;

public class SavingAccounts {
    static double annualInterestRate;
    private double savingsBalance;

    public SavingAccounts() {
    }
    private  double calculateMonthlyInterest(){
    return (savingsBalance*annualInterestRate)/12;
}
    public static void main(String[] args) {

        SavingAccounts saver1 = new SavingAccounts();
        SavingAccounts saver2 = new SavingAccounts();

    }
}