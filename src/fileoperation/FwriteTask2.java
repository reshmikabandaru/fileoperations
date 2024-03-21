// file1 and file2 content concat in another text file concatinated.txt)

package fileoperation;

import java.io.BufferedReader;
import java.io.BufferedWriter;//import io packages
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FwriteTask2 {

	public static void main(String[] args) {
		try (BufferedReader R1 = new BufferedReader(new FileReader("C:\\Users\\AASLIN-06\\file1.txt"));
				BufferedReader R2 = new BufferedReader(new FileReader("C:\\Users\\AASLIN-06\\file2.txt"));
				BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\AASLIN-06\\concatenated.txt"))) {

			String mytext;

			while ((mytext = R1.readLine()) != null) {
				bw.write(mytext);
				bw.newLine();
			}

			while ((mytext = R2.readLine()) != null) {
				bw.write(mytext);
				bw.newLine();
			}

			System.out.println("MY FILES  ARE CONCATINATED ");
		} catch (IOException io) {
			                          //handlings errors
			io.printStackTrace();
		}
	}
}
