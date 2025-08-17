import java.util.Scanner;

public class lcm_two {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int m =sc.nextInt();
        int max = (n>m) ? n:m;
        while(true){
            if( max %n == 0 && max % m == 0 ){
                 System.out.println(max);
                break;
                
            }
            max++;
         
        }
    }
}
