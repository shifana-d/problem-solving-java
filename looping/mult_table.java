import java.util.Scanner;
public class mult_table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mul = sc.nextInt();
        int n= sc.nextInt();
        for(int i =1 ; i<=mul ; i++ ){
            int res = i* n;
            System.out.println(i + " * " + n +  " = " + res );
        }
    }
    
}
