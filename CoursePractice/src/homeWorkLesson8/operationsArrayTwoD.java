package homeWorkLesson8;

public class operationsArrayTwoD {
    public static void main(String[] args) {
        int sum = 0;
        int avg = 0;
        int[][] arrayTwo = new int [][] {{1,4,7,20,-1,30},{5,8,7,6}};
        for (int i = 0; i < arrayTwo.length; i++) {
            for (int j = 0; j < arrayTwo[i].length; j++) {
                sum += arrayTwo[i][j];
                avg = sum/(arrayTwo[0].length + arrayTwo[1].length);

            }

        }
        System.out.println("Sum of 2D array is: " +sum);
        System.out.println("Average of 2D array is: " +avg);
    }
}
