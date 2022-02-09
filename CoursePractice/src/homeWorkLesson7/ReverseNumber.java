package homeWorkLesson7;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        int number;
        int reverseNumber;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter  a positive and whole number > 10: ");

        number = sc.nextInt();

        while (number < 10) {
            System.out.println("Your input is not valid. Try again: ");
            number = sc.nextInt();
        }
            System.out.print("Reverse of number " + number + " is: ");

            while (number > 0) {
                reverseNumber = number % 10;
                number = number / 10;
                System.out.print(reverseNumber);
            }
    }
}


//Write a program that prompts user for a positive integer. The program
//shall read the input as int; and print the "reverse" of the input integer.
//For examples:
//Enter a positive integer: 12345
//The reverse is: 54321
//Use loops, known operators, known subjects, but avoid already existing methods