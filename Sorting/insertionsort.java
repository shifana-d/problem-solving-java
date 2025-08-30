import java.util.*;
public class insertionsort 
{
	public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
	   int size = sc.nextInt();
	   int []a = new int[size] ;
	   int i , j ,copy;
	   for( i=0 ; i<size;i++)
	   {
	       a[i] = sc.nextInt();
	   }
	   
	   for(i=1 ; i<size ; i++)
	   {
	       j = i-1;
	       copy = a[i];
	       
	       while(j>=0  &&  a[j] > copy)
	       {
	           a[j+1] = a[j];
	           j--;
	       }
	       a[++j] = copy;	       
	       for(int  k=0 ; k<size;k++)
	   {
	      System.out.print(a[k]+" ");
	   }
	   System.out.println();
	   
	}
}
    
}
