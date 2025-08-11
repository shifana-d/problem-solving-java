import java.util.Scanner;

public class binary_grid {
     public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int row, col ;
        for(row = 1; row <= n ; row ++){
            for(col = 1; col <= n ; col++){
                if(row % 2 == col % 2)
                    System.out.print("1");
                else
                    System.out.print("0");
            }
            System.out.println();
        }
    }
}
    
