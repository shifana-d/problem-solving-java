import java.util.Scanner;

public class right_angled_triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int  row , col ;
       int n = sc.nextInt();
        for (row = 1 ; row <= n; row++){
            for  ( col = 1 ; col <= row; col++){
                System.out.print("*");
            }
                                System.out.println();       
        }
    }
}
    
