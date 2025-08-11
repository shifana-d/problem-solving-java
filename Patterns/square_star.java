import java.util.Scanner;

public class square_star {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, row, col;
        n = sc.nextInt();
        for(row = 1 ; row <=n; row++){
            for (col = 1; col<= n; col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

