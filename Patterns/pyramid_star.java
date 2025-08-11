import java.util.Scanner;

public class pyramid_star {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row, space, star;
        for(row = 1 ; row <= n; row++){
            for(space = 1; space <= n - row ; space++){
                System.out.print(" ");
            }
                for(star = 1; star <= 2*row -1 ; star++){
                    System.out.print("*");
                }
                    System.out.println();
        }
    }
    
}
