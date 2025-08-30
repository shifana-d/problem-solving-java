import java.util.Scanner;

public class selectionsort {
    public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
	   int size = sc.nextInt();
	   int []a = new int[size] ;
	   int i , j , index , min ;
	   for( i=0 ; i<size;i++)
	   {
	       a[i] = sc.nextInt();
	   }
	   
	   for(i=0;i<size-1 ; i++)
	   {
	       min = a[i];
	       index = i;
	       for(j=i+1 ; j<size ; j++)
	       {
	            if(a[j] < min)
	            {
	                index = j ;
	                min = a[j];
	            }
	       }
	       
	       int t = a[i];
	       a[i] = a[index];
	       a[index] = t;
	   }
	   
	    for( i=0 ; i<size;i++)
	   {
	      System.out.print(a[i]+" ");
	   }
    }
}
