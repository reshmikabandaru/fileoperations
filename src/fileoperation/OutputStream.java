package fileoperation;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintStream;

public class OutputStream {
public static void main(String[] args) {
	
 try(OutputStreamWriter ws = new OutputStreamWriter(System.out)){
	 
	 ws.write("text created");
	 
 }
 
 catch(IOException io)
 {
 	io.printStackTrace();
 }
 
}
}
