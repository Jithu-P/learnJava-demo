package fileClass;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadingFromFile {

	public static void main(String[] args) {

		// FileReader - read the contents of a file as a stream of characters, one by one. 
		// 'read()' returns an integer value which contains the byte value of whatever character it is
		// currently reading and we can easily cast that as a character value. 
		// When 'read()' returns -1, there is no more data to be read
		
		//a '.txt' file named 'art' is created and is copied to the project folder
		//Then some lines are written in the file
		
		try {
			FileReader reader = new FileReader("art.txt");
			
			int data = reader.read(); 	// add catch clause to surrounding try
			
			while(data != -1) {
				System.out.print((char)data); 	//casting as character value
				//NOTE: print is used instead of 'println'. Since the reader reads one character 
				//at a time, it will display all characters in a new line
				
				data = reader.read();
			} 
			
			/* implementation using do while loop
			int data;
			
			do {
				
				data = reader.read();
				System.out.print((char)data);
				
			}while(data != -1);
			*/
			
			reader.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
