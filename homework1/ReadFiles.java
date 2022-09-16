package homework1;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReadFiles extends Driver {

	public static int[] sixteenOrdered() throws Exception {
		Scanner scan = new Scanner(
				new File("C:\\Users\\thene\\OneDrive - CCSU\\CS-253 Data Structures\\NUMBERS\\16ordered.txt"));

		List<Integer> array = new ArrayList<>();

		while (scan.hasNextLine()) {
			array.add(scan.nextInt());
		}
		int intArr[] = new int[array.size()];
		for (int i = 0; i < array.size(); i++) {
			intArr[i] = array.get(i);
		}
		scan.close();
		return intArr;
	}

	public static int[] sixteenBackwards() throws Exception {
		Scanner scan = new Scanner(
				new File("C:\\Users\\thene\\OneDrive - CCSU\\CS-253 Data Structures\\NUMBERS\\16Backwards.txt"));

		List<Integer> array = new ArrayList<>();

		while (scan.hasNextLine()) {
			array.add(scan.nextInt());
		}
		int intArr[] = new int[array.size()];
		for (int i = 0; i < array.size(); i++) {
			intArr[i] = array.get(i);
		}
		scan.close();
		return intArr;
	}

	public static int[] sixteenRandom() throws Exception {
		Scanner scan = new Scanner(
				new File("C:\\Users\\thene\\OneDrive - CCSU\\CS-253 Data Structures\\NUMBERS\\16 Random.txt"));

		List<Integer> array = new ArrayList<>();

		while (scan.hasNextLine()) {
			array.add(scan.nextInt());
		}
		int intArr[] = new int[array.size()];
		for (int i = 0; i < array.size(); i++) {
			intArr[i] = array.get(i);
		}
		scan.close();
		return intArr;
	}

	public static int[] twoThousandOrdered() throws Exception {
		Scanner scan = new Scanner(
				new File("C:\\Users\\thene\\OneDrive - CCSU\\CS-253 Data Structures\\NUMBERS\\2000 in order.txt"));

		List<Integer> array = new ArrayList<>();

		while (scan.hasNextLine()) {
			array.add(scan.nextInt());
		}
		int intArr[] = new int[array.size()];
		for (int i = 0; i < array.size(); i++) {
			intArr[i] = array.get(i);
		}
		scan.close();
		return intArr;
	}

	public static int[] twoThousandReverse() throws Exception {
		Scanner scan = new Scanner(
				new File("C:\\Users\\thene\\OneDrive - CCSU\\CS-253 Data Structures\\NUMBERS\\2000backwards.txt"));

		List<Integer> array = new ArrayList<>();

		while (scan.hasNextLine()) {
			array.add(scan.nextInt());
		}
		int intArr[] = new int[array.size()];
		for (int i = 0; i < array.size(); i++) {
			intArr[i] = array.get(i);
		}
		scan.close();
		return intArr;
	}

	public static int[] twoThousandRandom() throws Exception {
		Scanner scan = new Scanner(
				new File("C:\\Users\\thene\\OneDrive - CCSU\\CS-253 Data Structures\\NUMBERS\\2000random.txt"));

		List<Integer> array = new ArrayList<>();

		while (scan.hasNextLine()) {
			array.add(scan.nextInt());
		}
		int intArr[] = new int[array.size()];
		for (int i = 0; i < array.size(); i++) {
			intArr[i] = array.get(i);
		}
		scan.close();
		return intArr;
	}

}
