import java.util.Scanner;

public class equal_string {
    
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        String a = sc.nextLine().trim();
        String b = sc.nextLine().trim();
        if (a.equals(b)) {
            System.out.println("Equal");
        } else {
            System.out.println("Not Equal");
        }
    }
}
