class MyCustomException extends Exception
{
	public MyCustomException(String message){
		super(message);
	}
}

public class Custom{
	public static void riskyMethod(int value) throws MyCustomException{
		if(value<0){
			throw new MyCustomException("Negetive value");
		}
		System.out.println("Value is "+(value*2));
	}
	
	public static void main(String[]args){
		try{
			riskyMethod(-5);
		}
		catch (MyCustomException e){
			System.out.println("Caught an error "+e.getMessage());
		}
	}
}