package fileoperation;

import java.io.FileReader;
import java.io.IOException;

public class Filereader {
	public static void main(String[] args) {
		try (FileReader fw = new FileReader("C:\\Users\\AASLIN-06\\reshmika"))
		
		{
			int letta = fw.read();
			while(fw.ready())
			{
				System.out.println((char)letta);
				letta=fw.read();
			}
			//	System.out.println((char)letta);		
			
		}
	


   catch(IOException io)
{
	io.printStackTrace();
}
	}
}