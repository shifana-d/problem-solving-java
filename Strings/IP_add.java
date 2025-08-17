import java.util.Scanner;
public class IP_add {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String ip = scanner.nextLine().trim();
        scanner.close();

        String[] parts = ip.split("\\.");

        if (parts.length != 4) {
            System.out.println("Invalid");
            return;
        }

        for (String part : parts) {
            if (part.length() == 0) {
                System.out.println("Invalid");
                return;
            }

            int num = 0;
            for (int i = 0; i < part.length(); i++) {
                char ch = part.charAt(i);
                if (ch < '0' || ch > '9') {
                    System.out.println("Invalid");
                    return;
                }
                num = num * 10 + (ch - '0');
                if (num > 255) {
                    System.out.println("Invalid");
                    return;
                }
            }

            // Leading zero check (disallow "01", "001", etc.)
            if (part.length() > 1 && part.charAt(0) == '0') {
                System.out.println("Invalid");
                return;
            }
        }

        System.out.println("Valid");
    }
}
