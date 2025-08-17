import java.util.Scanner;

public class password_check {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        String password = sc.nextLine();
        int upperCount = 0, lowerCount = 0, digitCount = 0, specialCount = 0;
        if (password.length() >= 10) {
            for (int i = 0; i < password.length(); i++) {
                char ch = password.charAt(i);
                if (ch >= 'A' && ch <= 'Z') {
                    upperCount++;
                } else if (ch >= 'a' && ch <= 'z') {
                    lowerCount++;
                } else if (ch >= '0' && ch <= '9') {
                    digitCount++;
                } else {
                    specialCount++;
                }
            }
        }

        if (upperCount > 0 && lowerCount > 0 && digitCount > 0 && specialCount > 0 && password.length() >= 10) {
            System.out.println("Strong password");
        } else {
            System.out.println("Weak password");
        }
    }
    
}
