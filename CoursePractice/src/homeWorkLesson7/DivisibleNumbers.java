package homeWorkLesson7;

public class DivisibleNumbers {
    public static void main(String[] args) {
        int j=0;
        int i;
        for (i = 100; i <= 1000; i++) {
            if (i % 5 == 0 || i % 6 == 0) {
                System.out.print(i + " ");
                j++;
                if (j == 10){
                System.out.println( );
                j = j-10;
                }
            }
        }
    }
}
