import java.util.Scanner;

public class inverted_pyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row, space, star;
        for(row = n ; row >= 1; row--){
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
    