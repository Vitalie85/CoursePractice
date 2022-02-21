package homeWorkLesson12.primeNimber;


public class PrimeNumbers {
    public static void main(String[] args) {
        int value = 10_000;
        int count = 0;
        int countPrints = 0;

        int[] primeNumber = new int[value];
        for (int i = 0; i < primeNumber.length; i++) {
            if (!(i % 2 == 0) || i/2 == 1) {
                primeNumber[i] = i;
            }
        }
        for (int primeNumbers : primeNumber) {
            if (primeNumbers > 1) {
                System.out.print(primeNumbers + " " );
                count++;
                countPrints++;
            }
            if(countPrints == 30){
                System.out.println( );
                countPrints = 0;
            }
        }
        System.out.println('\n'+"In range { 0; "+ value+"} "+ "were found "+ count +" prime numbers.");
    }
}


