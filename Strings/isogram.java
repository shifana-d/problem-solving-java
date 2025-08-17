import java.util.Scanner;

public class isogram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine().toLowerCase();
        boolean[] seen = new boolean[26];
        boolean isIsogram = true;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c >= 'a' && c <= 'z') {
                int index = c - 'a';
                if (seen[index]) {
                    isIsogram = false;
                    break;
                }
                seen[index] = true;
            }
        }
        if (isIsogram) {
            System.out.println("ISOGRAM");
        } else {
            System.out.println("NOT ISOGRAM");
        }
    }
}
