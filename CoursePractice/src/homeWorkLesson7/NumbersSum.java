package homeWorkLesson7;

import java.util.Scanner;

public class NumbersSum {
    public static void main(String[] args) {
        int numberOne;
        int numberTwo;
        int summ;
        boolean answer = false;
        String selectedOption;
        Scanner sc = new Scanner(System.in);


        do {
            System.out.println("Enter first number: ");
            numberOne = sc.nextInt();
            System.out.println("Enter second number: ");
            numberTwo = sc.nextInt();
            summ = numberOne + numberTwo;
            System.out.println("Summ of numbers entered is: " + summ);
            System.out.println("Do you want to continue YES/NO: ");
            selectedOption = sc.next();
            if (selectedOption.equals("YES")) {
                answer = true;
            } else {
                answer = false;
            }
        }
        while (answer);
        System.out.println("Goodbye");
    }

}
