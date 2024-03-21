package fileoperation;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class FReadTask1 {

	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new FileReader("C:\\\\Users\\\\AASLIN-06\\\\input.txt"))) {

			// System.out.println(br.readLine());

			Map<String, Integer> wordFrequencyMap = new HashMap<>();
			String text;
			while ((text = br.readLine()) != null) {

				String[] words = text.split("\\s+");

				for (String  l: words) {
					
					l = l.replaceAll("[^a-zA-Z]", "").toLowerCase();
				
					if (!l.isEmpty()) {
						wordFrequencyMap.put(l, wordFrequencyMap.getOrDefault(l, 0) + 1);
					}
				}
			}

			for (Map.Entry<String, Integer> obj : wordFrequencyMap.entrySet()) {
				System.out.println(obj.getKey() + ": " + obj.getValue());
			}

		}

		catch (IOException io) {
			io.printStackTrace();
		}

	}
}
