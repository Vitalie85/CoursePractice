package homeWorkLesson4;

public class TaxCalculator {
    public static void main(String[] args) {
        double price = 100.4;
        double tax = 1.2 ;
        int quantity = 30;
        double total;
        total = (price*quantity*tax);
        System.out.println("Total cost with tax is : " + total);
    }
}
