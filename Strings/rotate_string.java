import java.util.Scanner;

public class rotate_string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        sc.nextLine();
        String a = sc.nextLine();
        int l = a.length();
        int n = k % l;
        String ch = a.substring(n) + a.substring(0, n);
        System.out.print(ch);
    }
    }
    