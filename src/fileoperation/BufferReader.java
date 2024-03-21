package fileoperation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class BufferReader {


public static void main(String[] args) {
	try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) 
			{
		System.out.println("text");
		while(br.ready())
		{
			
			//System.out.println(br.readLine());
		}
		System.out.println(br.readLine());
			}
	
	catch(IOException io)
	{
		io.printStackTrace();
	}
}
}

