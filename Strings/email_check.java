import java.util.Scanner;
public class email_check {
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        String email = sc.nextLine();
        int at = email.indexOf('@');
        int dot = email.indexOf('.', at + 1);
        if (at > 0 && dot > at + 1 && dot < email.length() - 1) {
            System.out.println("Valid");
        } else {
            System.out.println("Invalid");
        }
    }
    
}
