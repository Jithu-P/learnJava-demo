package fileClass;

import java.io.File;

public class FileClassPractice {

	public static void main(String[] args) {

		File file = new File("javaFileClassPractice.txt");
		
		/*
		 * File file = new File("C:\\Users\\jithu\\Desktop\\learn_testing\\javaFileClassPractice.txt");
		 * absolute path should be used if the file is not present within the project
		 */
		
		//File file = new File("C:\Users\jithu\Desktop\learn_testing"); :- will not work
		// we should use either double slashes or single back slashes
		
		//File file = new File("C:/Users/jithu/Desktop/learn_testing/javaFileClassPractice.txt"); :- working
		
		
		if(file.exists()) {
			System.out.println("Yes"); 	// file should be added at the project level and not at
										// the package level or 'src' folder level. Then only
										// it is displaying 'Yes'
			// Otherwise, complete location (absolute path) should be given
			
			System.out.println(file.getPath());
			System.out.println(file.getAbsolutePath());
			System.out.println(file.isFile());	// returns false if it is a folder
			
			//file.delete(); 	
			
			// deletes the file from the project or from the computer
			// depending on the path given (filename or absolute path)
			// to view the change after deleting, the project should be refreshed
		}
		else {
			System.out.println("No");
		}		
		
	}

}
