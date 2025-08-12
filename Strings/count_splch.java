import java.util.Scanner;

public class count_splch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        int s = 0;
        for(int i = 0; i < a.length(); i++){
            char ch = a.charAt(i);
            if(!Character.isLetterOrDigit(ch))
            s++;
        }
         System.out.print(s);
    }
}
