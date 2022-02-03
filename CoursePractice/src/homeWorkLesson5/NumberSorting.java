package homeWorkLesson5;

import java.util.Scanner;

public class NumberSorting {
    public static void main(String[] args) {
        double number;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        number = sc.nextDouble();

        if(number == 0) {
            System.out.println("zero");
        } else if (number>0){
            System.out.println("positive");
        } else if (number<0) {
            System.out.println("negative");
        }
        if(number<0) {
            number *= -1;
        }
            if(number<1){
                System.out.println("small");
            }else if(number>1000_000){
                System.out.println("large");
            }
        }
    }
