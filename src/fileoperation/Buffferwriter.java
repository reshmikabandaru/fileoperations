package fileoperation;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Buffferwriter {
	public static void main(String[] args) {
//		try(BufferedWriter br = new BufferedWriter(new OutputStreamWriter(System.out))) {
		try(BufferedWriter br = new BufferedWriter(new java.io.FileWriter("C:\\Users\\AASLIN-06\\reshmika.txt"))) {
			br.write("text");
			
		}
		 catch(IOException io)
		
		{
			io.printStackTrace();
		}	
}
	}
