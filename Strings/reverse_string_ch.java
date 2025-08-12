import java.util.Scanner;

public class reverse_string_ch {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();

        char[] ch = a.toCharArray();
        int left = 0;
        int right = ch.length - 1;
        while (left < right) {
            if (!Character.isLetterOrDigit(ch[left])) {
                left++;
            }
            else if (!Character.isLetterOrDigit(ch[right])) {
                right--;
            }
      else {
                char temp = ch[left];
                ch[left] = ch[right];
                ch[right] = temp;
                left++;
                right--;
            }
        }

        System.out.println(new String(ch));
    }
    
}
