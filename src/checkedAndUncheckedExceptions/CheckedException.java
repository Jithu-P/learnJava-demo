package checkedAndUncheckedExceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckedException {

	public static void main(String[] args) {

		/* 
		Sometimes, when we write a code, Java won't allow us to compile it. Instead, it marks the 
		dangerous line of code with a red underline and prompts us to handle the possible exception. 
		Example - FileNotFoundException, IO Exception, SQL Exception etc.
		These are known as ***CHECKED EXCEPTIONS*** (Since Java checks them for us)
		We need to handle those exceptions to compile the program
		We could avoid handling it by 'throw'ing that exception from any method which contains that code. 
		Then Java will prompt us to handle the exception from where we 'call'ed that method which contains
		the code. Even from there we can 'throw' the exception again, all the way up to the Main method. 
		Now Java won't prompt us to handle it. But the program will stop whenever we face that exception. 
		*/
		
		readFile("myFile.txt"); //random file name; does not exist
		
	}
	
	
	static void readFile(String fileName) {
		try {
			FileReader reader = new FileReader(fileName); // reminded to handle the exception
			//reader.read(); // causes another checked exception
		} catch (FileNotFoundException e) {
			System.out.println("File doesn't exist");
			//e.printStackTrace();
		} 
	}
	
	
	// OR we can throw the exception from 'readFile' method to the 'Main' method and handle it there
	
	/*
	static void readFile(String fileName) throws FileNotFoundException{
		FileReader reader = new FileReader(fileName);
		// Then, we should surround the code with try-catch block in the Main method
	}	
	*/

}
