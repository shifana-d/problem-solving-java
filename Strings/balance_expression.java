import java.util.Scanner;

public class balance_expression {
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        String a = sc.next();
        int count = 0;
        int i = 0;
        while (i < a.length() && count >= 0) {
            char ch = a.charAt(i);
            if (ch == '(') {
                count++;
            } else if (ch == ')') {
                count--;
            }
            i++;
        }
        if (count == 0) {
            System.out.println("Balanced");
        } else {
            System.out.println("Unbalanced");
        }
    }
    
}
