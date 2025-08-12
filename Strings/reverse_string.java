import java.util.Scanner;

public class reverse_string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int length = 0;
        try {
            while (true) {
                input.charAt(length);
                length++;
            }
        } catch (Exception e) {
        }
        for (int i = length - 1; i >= 0; i--) {
            System.out.print(input.charAt(i));
        }
    }
    
}
