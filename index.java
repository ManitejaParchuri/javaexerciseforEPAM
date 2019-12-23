package epam;
import java.util.Scanner;

public class index {
	private static Scanner sc;

	public static void main (String args[]) {
		
	
	int i ,key,flag=0;
sc = new Scanner(System.in);
     System.out.println("enter the array size");
	int n =sc.nextInt();
	int arr[]=new int[n];
			System.out.println("enter the arry elements");
	for(i=0;i<n;i++)
	{
		arr[i]=sc.nextInt();
		
	}
	key =sc.nextInt();
	 for(i =0;i<n;i++)
     {
         if(arr[i]==key)
         {
             flag = 1;
             break;
         }
         else
         {
             flag = 0;
         }
     }
     if(flag == 1)
     {
         System.out.println("Element found at position:"+(i + 1));
     }
     else
     {
         System.out.println("-1");
     
     }
	}}
 