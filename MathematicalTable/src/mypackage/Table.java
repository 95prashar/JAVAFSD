package mypackage;
import java.util.Scanner;
public class Table
{
	public static void main (String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		for (int i=1; i<=20; i++)
		{
		  System.out.println(num+"X"+i+"="+num*i);
		}
			
	}
}
