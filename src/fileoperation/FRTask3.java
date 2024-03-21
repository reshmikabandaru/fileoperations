// input text file contains contain user has to reverse the content and write it in another text file i.e.reversed .txt
package fileoperation;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FRTask3 {
	public static void main(String[] args) {
		//read and write using BufferedReader
		try (BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\AASLIN-06\\RInput.txt"));
			 BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\AASLIN-06\\reversed.txt"))) 
		{

			String reshtext;

			while ((reshtext = reader.readLine()) != null) {
				String revtext = revString(reshtext);
				writer.write(revtext);
				writer.newLine();
			}
			
			//text reversed placed in reversed.txt
		 System.out.println("THE TEXT IS REVERSED AND WRITTEN IN 'reversed.txt'");
		} 
		catch (IOException io)
		{
			System.err.println("ERROR" + io.getMessage());
		}
	}

	private static String revString(String s) {
		int k = s.length() - 1;  // used string builder to create sequence of objects
		StringBuilder sb = new StringBuilder();//method to reverse the words in a line
		for (int i = k; i >= 0; i--) {
			sb.append(s.charAt(i));// to append the current value
		}
		return sb.toString();//to print a stringformat
	}
}
