//barrington fields
//currently the date i 4/7/2025
import java.util.*;


public class accountsetup {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter a username");
        String Username = scan.next();
        System.out.println("Enter a password that is at least 8 characters");
        String Password = scan.next();
        
            while (Password.length()<8){
            System.out.println("Your password is less than 8, make a new one");
            Password = scan.next();
        }



        System.out.println("Your username is " + Username.toLowerCase()+ " and your password is "+Password.toLowerCase());

    }
}