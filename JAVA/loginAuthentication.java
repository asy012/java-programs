import java.util.Scanner;
public class loginAuthentication {
    public static void main(String[] args){
        String Username = "ashish1207";
        String Password = "as12@#";

        System.out.println("You have 3 attempts");
        for (int i = 1; i <= 3; i++){
            Scanner sc = new Scanner(System.in);
            String username = sc.nextLine();
            String paasword = sc.nextLine();

            if(username.equals(Username) && paasword.equals(Password)){
                System.out.println("Access granted");
                break;
            } else{
                if(i == 3){
                    System.out.println("Account locked");
                } else{
                    System.out.println(
                            "Incorrect username or password. Attempts left: " + (3 - i));
                }
            }
        }
    }
}
