package homeWorkLesson8;

/*Make a Java program to copy the elements of one array to another array. (Don’t
use clone() method)*/

public class copyArray {
    public static void main(String[] args) {

    int[] arrayOne = new int []{10,4,7,20,15,18};
    int[] copyOfArrayOne = new int[arrayOne.length];

        for (int i = 0; i < arrayOne.length; i++) {
            copyOfArrayOne[i] = arrayOne[i];
        }
        System.out.print("elements for arrayOne: ");
        for (int tempVal:arrayOne) {
            System.out.print(tempVal + " ");
        }

        System.out.print('\n'+"elements for copyOfArrayOne: ");
        for (int tempVal:copyOfArrayOne) {

            System.out.print(tempVal + " ");

        }
    }
}

