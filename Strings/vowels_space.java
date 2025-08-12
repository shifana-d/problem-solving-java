import java.util.Scanner;

public class vowels_space {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine(); 
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ) {
                result += " ";
            } else {
                result += ch; 
        }
        }
        System.out.println(result);
    }
    
}
