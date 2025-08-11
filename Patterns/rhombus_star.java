import java.util.Scanner;

public class rhombus_star {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int row, space,star;
        for(row = 1; row <=n ; row++){
            for(space = 1 ; space <= n - row; space++){
                System.out.print(" ");
            }
                for(star = 1 ; star <= n ; star++){
                    System.out.print("*");
                }
                    System.out.println();
                }
        
    }
}
    