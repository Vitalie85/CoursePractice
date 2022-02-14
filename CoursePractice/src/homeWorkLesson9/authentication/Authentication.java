package homeWorkLesson9.authentication;
/*You have to design the code such that the user has only three tries to
guess the correct pin of the account. You set the pin as a constant with a final
attribute. When correct, display “Correct, welcome back.”;  When incorrect,  display
“Incorrect, try again.”. When ran out of tries, display “Sorry but you have been
locked out.”*/

public class Authentication {
    String username;
    String password;

    public Authentication (String username, String password){
        this.username = username;
        this.password = password;

     }
     public String showUser(){
         return username;
     }
     public String showPass(){
        return password;
     }
    }




