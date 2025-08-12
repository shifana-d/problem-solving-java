import java.util.Scanner;

public class search_ch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char a = sc.next().charAt(0);
      sc.nextLine();
        String word = sc.nextLine();
        if(word.contains(String.valueOf(a))){
            System.out.print("Present");
        }
        else
        {
            System.out.print("Not Present");
        }
    }
    
}
