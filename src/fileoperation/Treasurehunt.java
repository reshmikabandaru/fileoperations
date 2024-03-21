package fileoperation;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class Treasure {
	int x;
	int y;

	Treasure(int x, int y) {
		this.x = x;
		this.y = y;
	}

	double distanceTo(int X, int Y) {
		return Math.sqrt(Math.pow(x - X, 2) + Math.pow(y - Y, 2));
	}
}

public class Treasurehunt {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String path = "C:\\Users\\AASLIN-06\\treasure_map.txt";
		

		ArrayList<Treasure> tr = readTreasure(path);

		if (tr.isEmpty()) {
			System.out.println("NO TREASURE FOUND IN THIS FILE");
			return;
		}

		while (true) {
			System.out.print("Enter your current X coordinate: ");
			int X = sc.nextInt();
			System.out.print("Enter your current Y coordinate: ");
			int Y = sc.nextInt();

			ArrayList<TreasureDistance> treasuredis = calDistances(tr, X, Y);
			Collections.sort(treasuredis, Comparator.comparingDouble(TreasureDistance::getDistance));
                
			// System.out.println("Distance to treasures:");

			for (TreasureDistance tD : treasuredis) {
				System.out.println(
						"Treasure at (" + tD.getTreasure().x + ", " + tD.getTreasure().y + ") : " + tD.getDistance());
			}

			System.out.print("WANT TO SEARCH MORE");
			String userchoice = sc.next();
			if (!userchoice.equalsIgnoreCase("yes")) {
				break;
			}
		}
	}

	private static ArrayList<Treasure> readTreasure(String Path) {
		ArrayList<Treasure> treasures = new ArrayList<>();
		try (BufferedReader br = new BufferedReader(new FileReader(Path))) {
			String text;
			while ((text = br.readLine()) != null) {
				String[] parts = text.split(" ");
				int x = Integer.parseInt(parts[0]);
				int y = Integer.parseInt(parts[1]);
				treasures.add(new Treasure(x, y));
			}
		} catch (IOException e) {
			System.out.println("ERROR " + e.getMessage());
		}
		return treasures;
	}

	private static ArrayList<TreasureDistance> calDistances(ArrayList<Treasure> treasures, int cX, int cY) {
		ArrayList<TreasureDistance> distances = new ArrayList<>();
		for (Treasure treasure : treasures) {
			double distance = treasure.distanceTo(cX, cY);
			distances.add(new TreasureDistance(treasure, distance));
		}
		return distances;
	}
}

class TreasureDistance {
	private Treasure treasure;
	private double distance;

	public TreasureDistance(Treasure treasure, double distance) {
		this.treasure = treasure;
		this.distance = distance;
	}

	public Treasure getTreasure() {
		return treasure;
	}

	public double getDistance() {
		return distance;
	}
}