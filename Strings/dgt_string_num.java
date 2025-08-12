import java.util.Scanner;

public class dgt_string_num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String result = "";  
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch >= '0' && ch <= '9') {
                result += ch; 
            }
        }
        if (result.equals("")) {
            System.out.println(0);
        } else {
            System.out.println(result);
        }
    }
    
}
