package homeWorkLesson9.charLoop;

import java.util.Scanner;

public class CharLoop {
    public static void main(String[] args) {
        String userInput;
        int count = 0;

        System.out.println("Enter a sentence: ");

        Scanner sc = new Scanner(System.in);
        userInput = sc.nextLine();

        for (int i = 0; i < userInput.length(); i++) {
            if (userInput.charAt(i) == 'a') {
                count++;
            }
        }
        if (count > 0) {
            System.out.println("Number of a's: " + count);
        } else {
            System.out.println("Not found");
        }
    }
}
