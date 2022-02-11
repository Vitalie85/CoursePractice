package homeWorkLesson8;

public class operationsArrayTwoD {
    public static void main(String[] args) {
        int sum = 0;
        int avg = 0;
        int count = 0;
        int[][] arrayTwo = new int[][]{{1, 4, 7, 20, -1, 30}, {5, 8, 7, 6}};
        for (int i = 0; i < arrayTwo.length; i++) {
            for (int j = 0; j < arrayTwo[i].length; j++) {
                sum += arrayTwo[i][j];
                avg = sum/(arrayTwo[0].length + arrayTwo[1].length);
            }
        }
        System.out.print("Odd numbers are: ");
        for (int i = 0; i < arrayTwo.length; i++) {
            for (int j = 0; j < arrayTwo[i].length; j++) {
                if (arrayTwo[i][j] % 2 == 0)
                    System.out.print(arrayTwo[i][j] + " ");
            }
        }
        System.out.print("\n"+"Even numbers are: ");
        for (int i = 0; i < arrayTwo.length; i++) {
            for (int j = 0; j < arrayTwo[i].length; j++) {
                if (!(arrayTwo[i][j] % 2 == 0))
                    System.out.print(arrayTwo[i][j] + " ");
            }
        }
        System.out.println('\n' + "Sum of 2D array is: " + sum);
        System.out.println("Average of 2D array is: " + avg);
    }
}