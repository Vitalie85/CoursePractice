package homeWorkLesson5;

import java.util.Scanner;

public class OddEvenNumbers {
    public static void main(String[] args) {
        int number;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number: ");
        number = sc.nextInt();
        sc.close();
        if (number % 2 == 0) {
            System.out.println("Number entered is even");
        } else {
            System.out.print("Number entered is odd");
        }
    }
}
