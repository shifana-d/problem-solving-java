import java.util.Scanner;
public class manual_division {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int q =0;
        while (n>= m)
        { 
          n = n - m ;
           q++;
        }
    System.out.println(q) ;
    }
}
    

