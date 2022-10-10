package homework2;

public class Sorts {
	private static int comparisons;
	private static int exchanges;
	// this sort is going at a rate of N/2 just to see how bad the sorted list will
	// turn out
	public static void ShellSort(int[] array) {

		int number = array.length;
		int comparisons = 0;
		int exchanges = 0;
		int key = 0;
		int temp = 0;

		for (int rate = number / 2; rate > 0; rate /= 2) {
			for (int index = rate; index < number; index++) {
				key = array[index];
				temp = index;
				while (temp >= rate && array[temp - rate] > key) {
					comparisons++;
					array[temp] = array[temp - rate];
					temp = temp - rate;
					exchanges++;
				}
				array[temp] = key;
			}
		}
		System.out.println("THIS IS GOING AT A RATE OF N/2");
		System.out.println("Shell Sort: Number of Exchanges: " + exchanges);
		System.out.println("Shell Sort: Number of Comparisons: " + comparisons);
		System.out.println("Sorted file:");
		for (int i = 0; i < array.length; i++)
			System.out.print(array[i] + " ");
		System.out.println();
	}

	// This one I'm going to go at a rate of N/5
	public static void ShellSortV2(int[] array) {

		int number = array.length;
		int comparisons = 0;
		int exchanges = 0;
		int key = 0;
		int temp = 0;

		for (int rate = number / 5; rate > 0; rate /= 5) {
			for (int index = rate; index < number; index++) {
				key = array[index];
				temp = index;
				while (temp >= rate && array[temp - rate] > key) {
					comparisons++;
					array[temp] = array[temp - rate];
					temp = temp - rate;
					exchanges++;
				}
				array[temp] = key;
			}
		}
		System.out.println("THIS IS GOING AT A RATE OF N/5");
		System.out.println("Shell Sort: Number of Exchanges: " + exchanges);
		System.out.println("Shell Sort: Number of Comparisons: " + comparisons);
		System.out.println("Sorted file:");
		for (int i = 0; i < array.length; i++)
			System.out.print(array[i] + " ");
		System.out.println();
	}

	public static int partition(int intArray[], int low, int high) {
		int pi = intArray[high];
		int i = (low - 1);
		for (int j = low; j < high; j++) {
			comparisons++;
			if (intArray[j] <= pi) {
				i++;
				// swap intArray[i] and intArray[j]
				int temp = intArray[i];
				intArray[i] = intArray[j];
				intArray[j] = temp;
				exchanges++;
			}
		}
		
		int temp = intArray[i + 1];
		intArray[i + 1] = intArray[high];
		intArray[high] = temp;
		exchanges++;
		return i + 1;
		
	}

	
	public static void quickSort(int intArray[], int low, int high) {
		if (low < high) {
			
			int pi = partition(intArray, low, high);
			quickSort(intArray, low, pi - 1);
			quickSort(intArray, pi + 1, high);
			
		}
	}
		
		public static void print(int intArray[]) {
			
			System.out.println("Comparisons: " + comparisons);
			System.out.println("Exchanges: " + exchanges);
		}
	
		
	}
	


