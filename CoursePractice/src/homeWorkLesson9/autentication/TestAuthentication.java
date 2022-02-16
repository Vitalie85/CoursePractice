package homeWorkLesson9.autentication;

import java.util.Scanner;

public class TestAuthentication {

    Authentication[] authentication = new Authentication[2];

    public TestAuthentication() {
        authentication[0] = new Authentication("Vitalie", "pass1");
        authentication[1] = new Authentication("abc123", "pass2");
    }

    public boolean checkUser(String inputUsername) {
        for (Authentication auth : authentication) {
            if (auth.showUser().equals(inputUsername)) {
                return true;
            }
        }
        return false;
    }

    public boolean checkPass(String inputPassword, String inputUsername) {
        for (Authentication auth : authentication) {
            if (auth.showPass().equals(inputPassword) && (auth.showUser().equals(inputUsername))) {
                return true;
            }
        }
        return false;
    }

        public static void main(String[] args) {

            String inputUsername;
            String inputPassword;
            int count = 2;

            TestAuthentication test = new TestAuthentication();
            Scanner sc = new Scanner(System.in);
            System.out.println("Please enter your Login: ");
            inputUsername = sc.next();

            if (test.checkUser(inputUsername)) {

                System.out.println("Enter password, " + inputUsername + ":");
                inputPassword = sc.next();

                do {
                    if (test.checkPass(inputPassword, inputUsername)) {
                        System.out.println("Welcome back, " + inputUsername);
                        break;
                    } else {
                        System.out.println("Your password is incorect, you have " + count + " trial(s) left, try again: ");
                        inputPassword = sc.next();
                        count--;
                    }
                } while (count > 0);

                if (count == 0) {
                    System.out.println("You have reached maximum permitted trials, please find your password and comme back later!!!");
                }

            } else {
                System.out.println("We have not found users with this login!!!");
            }
    }
}
