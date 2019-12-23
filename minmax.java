package epam;
import java.util.Scanner;

public class minmax {
	private static Scanner sc;

	public static void main (String args[]) {
		
	
	int i,j,temp;
sc = new Scanner(System.in);
     System.out.println("enter the array size");
	int n =sc.nextInt();
	int arr[]=new int[n];
			System.out.println("enter the arry elements");
	for(i=0;i<n;i++)
	{
		arr[i]=sc.nextInt();
		
	}
	for(i=0;i<n;i++)
	{
		for(j=i+1;j<n;j++)
		{
			if(arr[i]>arr[j])
			{
				temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
		}
		
		
	}
			
  }
	System.out.println(arr[0]+" "+arr[n-1]);	
}
	
}