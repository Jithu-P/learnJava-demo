package checkedAndUncheckedExceptions;

public class UncheckedExceptions {

	public static void main(String[] args) {
		/*
		There are some exceptions for which Java does not prompt the user to handle. These are known
		as **UNCHECKED EXCEPTIONS**. 
		Example - NullPointerException
		Still, we should handle these exceptions to ensure smooth running of our program. 
		
		NOTE: 
		RuntimeException and any other exceptions which are sub classes of RuntimeException are
		Unchecked Exceptions in Java
		*/
		
		//String name = "Michael"; //If instead: 
		
		//String name = null; // will cause NullPointerException (Unchecked)
		
		//so, handle the exception
		
		try {
			String name = null;
			System.out.println(name.length());
		}catch(NullPointerException e) {
			System.out.println("Name can't be 'null'");
		}
		
		

	}

}
