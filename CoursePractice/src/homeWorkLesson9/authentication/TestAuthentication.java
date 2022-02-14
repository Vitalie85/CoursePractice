package homeWorkLesson9.authentication;

import java.util.Scanner;

public class TestAuthentication {
    public static void main(String[] args) {
        String inputUsername;
        String inputPassword;
        int count = 2;
        boolean input = false;
        Authentication[] authentication = new Authentication[2];
        authentication[0] = new Authentication("Vitalie", "pass1");
        authentication[1] = new Authentication("abc123", "pass2");

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your Login: ");
        inputUsername = sc.next();

        for (Authentication auth : authentication) {
            if (auth.showUser().equals(inputUsername)) {
                inputUsername = auth.showUser();


                System.out.println("Enter password, " + inputUsername + ":");
                inputPassword = sc.next();

                do {
                    if (auth.showPass().equals(inputPassword)) {
                        System.out.println("Welcome back, " + inputUsername);
                        break;
                    } else {
                        System.out.println("Your password is incorect, you have " + count + " trials left, try again: ");
                        inputPassword = sc.next();
                        count--;
                    }
                } while (count > 0);

                    if(count == 0){
                    System.out.println("You have reached maximum permitted trials, please find your password and comme back later!!!");
                }
            }

        }
        System.out.println("We have not found users with this Login!");
    }
}





