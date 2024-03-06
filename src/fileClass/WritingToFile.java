package fileClass;

import java.io.FileWriter;
import java.io.IOException;

public class WritingToFile {

	public static void main(String[] args) {

		try {
			FileWriter writer = new FileWriter("address.txt");
			writer.write("house number: 121\nabc street\n");
			writer.append("xyz state\nzip code: 563981");
			writer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
