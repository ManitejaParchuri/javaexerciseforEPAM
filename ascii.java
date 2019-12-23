package epam;

import java.util.Scanner;
public class ascii
{
              private static Scanner s;

			public static void main(String args[])
        {
              int i;
              s = new Scanner(System.in);
              System.out.print("Enter The Size of the Array : ");
              int size=s.nextInt();
              int arr[]=new int[size];
              System.out.println("Enter the elements of Array");
              for( i=0;i<arr.length;i++)
                 {
                                 arr[i]=s.nextInt();
                                 char c=(char)arr[i];
                                 System.out.println(c);
                 }
             
        }
}
