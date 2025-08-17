import java.util.*;
public class anagram{
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine().trim();
        String b = sc.nextLine().trim();
       String  c = a.replace(" ", "").toLowerCase();
       String d = b.replace(" ", "").toLowerCase();
        char[] arr1 = c.toCharArray();
        char[] arr2 = d.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        if (Arrays.equals(arr1, arr2)) {
            System.out.println(a + " and " + b + " are Anagrams.");
        } else {
            System.out.println(a + " and " + b + " are Not Anagrams.");
        }
    }
}
        