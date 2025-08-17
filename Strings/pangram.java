import java.util.Scanner;

public class pangram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine().toLowerCase();
        boolean[] found = new boolean[26];
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                int index = ch - 'a';
                if (!found[index]) {
                    found[index] = true;
                    count++;
                }
            }
        }
        if (count == 26) {
            System.out.println("Pangrams");
        } else {
            System.out.println("Not Pangrams");
        }

    }
}
