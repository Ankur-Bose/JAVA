//Q3
import java.util.*;
public class Q3
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number ");
		String userInput = sc.nextLine();
		try{
			int number = Integer.parseInt(userInput);
			System.out.println("You entered a number ");
		}
		catch( NumberFormatException e){
			System.out.println("Error ");
		}
		finally{
			sc.close();
		}
	}
}