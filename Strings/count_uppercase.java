import java.util.Scanner;
public class count_uppercase{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        int u = 0;
        for(int i = 0; i < a.length() ; i++){
            char ch = a.charAt(i);
            if(ch >= 'A' && ch <= 'Z')
                u++;
        }
        System.out.print(u);
        
    }
}