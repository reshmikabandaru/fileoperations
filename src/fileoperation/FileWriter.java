package fileoperation;

import java.io.IOException;

public class FileWriter {
public static void main(String[] args) {
		
	try ( java.io.FileWriter fw = new java.io.FileWriter("C:\\Users\\AASLIN-06\\reshmika.txt")){
		
		fw.write("text");
		
		
	} catch ( IOException io) {
		io.printStackTrace();
	}
}
}
