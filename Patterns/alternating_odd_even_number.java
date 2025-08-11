import java.util.Scanner;

public class alternating_odd_even_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row, col, val;
        for(row = 1; row <=n ; row ++){
            if(row % 2 == 0)
                val = 2;
            else 
                val = 1;
            for(col = 1 ; col <= row ; col++){
                System.out.print(val);
                val = val + 2;
            }
            System.out.println();
        }
        
    }
    
}
