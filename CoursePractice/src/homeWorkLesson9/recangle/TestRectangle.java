package homeWorkLesson9.recangle;

import java.util.Scanner;

public class TestRectangle {
    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle();

        Scanner sc = new Scanner(System.in);
            System.out.println("Enter length: ");
        rectangle.length = sc.nextInt();
            System.out.println("Enter width:");
        rectangle.width = sc.nextInt();

        rectangle.setDim(rectangle.length, rectangle.width);

            System.out.println(rectangle.getArea ());
    }
}
