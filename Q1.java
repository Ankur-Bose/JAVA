//Q1
import java.util.*;
public class Q1
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		int a,b;
		int result=0; 
		a = sc.nextInt();
		b = sc.nextInt();
		try
		{
			result = a/b;
		}
		catch ( ArithmeticException e){
			System.out.println("Cannot be divided");
		}
		System.out.println("Result "+result);
	}
}