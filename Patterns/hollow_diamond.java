import java.util.Scanner;

public class hollow_diamond {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row,col;
        int size = 2*n-1;
        for( row = 0; row < size; row++){
            for(col = 0 ; col < size ; col ++){
                if(row == col || row + col== size - 1){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    
}
