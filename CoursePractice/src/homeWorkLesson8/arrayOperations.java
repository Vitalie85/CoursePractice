package homeWorkLesson8;

/* Make a Java program that would calculate the sum, average, the number of even
and odd elements of an one-dimensional array and a two-dimensional array of type
int*/

public class arrayOperations {
    public static void main(String[] args) {
        int summ = 0;
        int avg = 0;

        int[] arrayOne = {18, 4, 7, 20, 15, 30};

        for (int i = 0; i < arrayOne.length; i++) {
            summ += arrayOne[i];
            avg = summ / arrayOne.length;

        }
        System.out.print("Odd numbers are: ");
        for (int i = 0; i < arrayOne.length; i++) {
            if (arrayOne[i] % 2 == 0) {
                System.out.print(arrayOne[i] + " ");
            }
        }
        System.out.print('\n'+"Even numbers are: ");
        for (int i = 0; i < arrayOne.length; i++) {
            if (!(arrayOne[i] % 2 == 0)) {
                System.out.print(arrayOne[i] + " ");
            }
        }
        System.out.println('\n' + "Sum of array elements is: " + summ);
        System.out.println("Average of array elements is: " + avg);
    }
}
