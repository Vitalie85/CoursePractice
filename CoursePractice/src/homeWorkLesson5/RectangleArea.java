package homeWorkLesson5;

import java.util.Scanner;

public class RectangleArea {
    int width;
    int lenght;
    int area;

    public int  areaCalculator(int width, int lenght) {
        area = width * lenght;
        return area;
    }
    public static void main(String[] args) {
     RectangleArea rectangle1 = new RectangleArea();
     RectangleArea rectangle2 = new RectangleArea();

     Scanner sc = new Scanner(System.in);
        System.out.println("Enter width for triangle 1: ");
            rectangle1.width = sc.nextInt();
        System.out.println("Enter lenght for triangle 1: ");
             rectangle1.lenght =sc.nextInt();
        System.out.println("Enter width for triangle 2:");
             rectangle2.width = sc.nextInt();
        System.out.println("Enter lenght for triangle2 : ");
             rectangle2.lenght =sc.nextInt();
     sc.close();

     int areaRectangle1 = rectangle1.areaCalculator (rectangle1.width, rectangle1.lenght);
     int areaRectangle2 = rectangle2.areaCalculator (rectangle2.width, rectangle2.lenght);

     if(areaRectangle1>areaRectangle2){
         System.out.println("First triangle has greater area.");
     } else if (areaRectangle1<areaRectangle2) {
         System.out.println("Second triangle has greater area.");
     } else {
         System.out.println("Triangles have same area.");
     }
    }

}
