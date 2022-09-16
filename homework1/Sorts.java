package homework1;

public class Sorts {

	public static void selectionSort(int[] array) {

		int temp = 0;
		int min = 0;
		int exchanges = 0;
		int comparisons = 0;
		int numberOfItems = array.length;
		for (int pass = 0; pass != numberOfItems - 1; pass++) {
			min = pass;
			for (int index = pass + 1; index != numberOfItems; index++) {
				comparisons++;
				if (array[index] < array[min])
					min = index;
			}
			temp = array[min];
			array[min] = array[pass];
			array[pass] = temp;
			exchanges++;

		}
		System.out.println("Selection Sort: Number of Exchanges: " + exchanges);
		System.out.println("Selection Sort: Number of Comparisons: " + comparisons);
		System.out.println("Sorted file:");
		for (int i = 0; i < array.length; i++)
			System.out.print(array[i] + " ");
		System.out.println();
	}

	public static void bubbleSort(int[] array) {

		int temp = 0;
		int exchanges = 0;
		int comparisons = 0;
		int numberOfItems = array.length;
		for (int i = 0; i < numberOfItems; i++) {
			for (int j = 1; j < (numberOfItems - i); j++) {
				comparisons++;
				if (array[j - 1] > array[j]) {
					temp = array[j - 1];
					array[j - 1] = array[j];
					array[j] = temp;
					exchanges++;
				}
			}
		}
		System.out.println("Bubble Sort: Number of Exchanges: " + exchanges);
		System.out.println("Bubble Sort: Number of Comparisons: " + comparisons);
		System.out.println("Sorted file:");
		for (int i = 0; i < array.length; i++)
			System.out.print(array[i] + " ");
		System.out.println();

	}

	public static void insertionSort(int[] array) {
		int exchanges = 0;
		int comparisons = 0;
		int numberOfItems = array.length;
		for (int index = 1; index < numberOfItems; ++index) {
			int key = array[index];
			int j = index - 1;
			comparisons++;

			while (j >= 0 && array[j] > key) {
				array[j + 1] = array[j];
				j = j - 1;
				exchanges++;
			}
			array[j + 1] = key;
		}
		System.out.println("Insertion Sort: Number of Exchanges: " + exchanges);
		System.out.println("Insertion Sort: Number of Comparisons: " + comparisons);
		System.out.println("Sorted file:");
		for (int i = 0; i < array.length; i++)
			System.out.print(array[i] + " ");
		System.out.println();
	}
}
