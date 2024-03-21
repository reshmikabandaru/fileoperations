package fileoperation;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class FWriteTask1 {

	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\AASLIN-06\\input.txt"));
				BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\AASLIN-06\\WORD_FREQUENCIES.TXT"))) {

			Map<String, Integer> wordcount = new HashMap<>();
			String text;
			while ((text = br.readLine()) != null) {
				String[] words = text.split("\\s+");
				for (String w : words) {
					w = w.replaceAll("[^a-zA-Z]", "").toLowerCase();
					if (!w.isEmpty()) {
						wordcount.put(w, wordcount.getOrDefault(w, 0) + 1);
					}
				}
			}

			for (Map.Entry<String, Integer> entry : wordcount.entrySet()) {
				bw.write(entry.getKey() + ": " + entry.getValue());
				bw.newLine();
			}
			System.out.println("Word frequencies written to WORD_FREQUENCIES.TXT");

		} catch (IOException io) {
			io.printStackTrace();
		}
	}
}
