package fileoperation;

import java.io.IOException;
import java.io.InputStreamReader;

public class Systemreader {
	public static void main(String[] args) {
try(InputStreamReader is = new InputStreamReader(System.in) )

{
	int letta = is.read();
	while(is.ready())
	{
		System.out.println((char)letta);
		letta=is.read();
	}
	is.close();
	}
catch(IOException io)
{
	io.printStackTrace();
}
}
}
