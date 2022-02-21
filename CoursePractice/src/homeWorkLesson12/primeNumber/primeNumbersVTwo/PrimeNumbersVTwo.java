package homeWorkLesson12.primeNumber.primeNumbersVTwo;


public class PrimeNumbersVTwo {

    public boolean primeNumbers(int number) {
        if (!(number % 2 == 0) && number>1 || number / 2 == 1) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        PrimeNumbersVTwo prime = new PrimeNumbersVTwo();
        int value = 10_000;
        int count = 0;
        int countPrints = 0;
        int number = 0;
        boolean numberIs;

        for (int i = 0; i < value; i++) {
            number = i;

            numberIs = prime.primeNumbers(number);
            if (numberIs) {
                System.out.print(number + " ");
                count++;
                countPrints++;
            }
            if (countPrints == 30) {
                System.out.println();
                countPrints = 0;
            }

        }
        System.out.println('\n' + "In range { 0; " + value + "} " + "were found " + count + " prime numbers.");
    }
}


