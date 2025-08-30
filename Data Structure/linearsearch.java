import java.util.Scanner;

public class linearsearch {
    public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
	   int size = sc.nextInt();
	   int []a = new int[size] ;
	   for(int i=0 ; i<size;i++)
	   {
	       a[i] = sc.nextInt();
	   }
	   System.out.print("key : ");
	   int key = sc.nextInt();
	   int flag = 0;
	   for(int i=0;i<size;i++)
	   {
	       if(a[i] == key)
	       {
	           flag = 1;
	           break;
	       }
	   }
	   if(flag ==1)
	   {
	       System.out.println("match");
	   }
	   else 
	    System.out.println("not match");
	}
}
