import java.util.Scanner;

public class box_cross {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int size = 2 * n - 1;
        for(int row = 0; row < size ; row++){
            for(int col = 0; col < size ; col++){
                if(row == 0 || row == size - 1 || col== 0 || col == size - 1 || row == col || row + col == size - 1){
                    System.out.print("*");
                }
                    else
                        System.out.print(" ");
                }
                System.out.println();
            }
        }
    
}
