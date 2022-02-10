package homeWorkLesson8;

/*1. Declare an array of type int. Allocate memory for this array and initialize it with
different numeric values. Display array elements on the console.
(If you want to make it more complex, you can ask the user to introduce the array
length and values)*/

import java.util.Scanner;

public class ArrayDeclarationTaskOne {
    public static void main(String[] args) {
        int userArrayLenght;
        int valueForIndex;

        System.out.println("Enter array lenght:");

        Scanner sc = new Scanner(System.in);
        userArrayLenght = sc.nextInt();

        int[] anArray = new int[userArrayLenght];
        for (int i = 0; i < userArrayLenght; i++) {
            System.out.println("Enter value for index " +i);
            valueForIndex = sc.nextInt();
            anArray[i] = valueForIndex;

        }
        System.out.print("Elements entered for array with lenght of " +userArrayLenght+ " values are: ");
        for (int tempVal:anArray){
            System.out.print(tempVal+ " ");
            
        }


    }
}

