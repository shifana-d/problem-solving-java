import java.util.Scanner;

public class alpha_ntimes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for (int i =0; i<n ; i++){
             for(char ch = 'a'; ch <='z' ; ch++){
            System.out.print(ch +" ");
        }
    System.out.println();
    }
} 
}
