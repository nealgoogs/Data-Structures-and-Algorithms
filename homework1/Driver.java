package homework1;

public class Driver {

	
	public static void main(String[] args) throws Exception{
		int [] arrayList = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10,11,12,13,14,15,16,17,18,19,20,21,22,23,24};
		int target = 12;
		int target2 = 91;
		boolean result = RecursiveBinarySearch.binarySearch(arrayList, target);
		boolean result2 = RecursiveBinarySearch.binarySearch(arrayList, target2);
		if (result == false)
			System.out.println("Element not present");
			else
			System.out.println("Element found " + result);
		if (result2 == false)
			System.out.println("Element not present");
			else
			System.out.println("Element found " + result2);
		
		int factorNumber = 5;
		System.out.println("Factorial of " + factorNumber + " is " + FactorialOfN.fact(5));
		
		int fibNumber = 9;
		System.out.println(Fibonacci.fib(fibNumber));
		
		System.out.println();
	
		System.out.println("Sixteen Ordered");
		Sorts.selectionSort(ReadFiles.sixteenOrdered());
		Sorts.bubbleSort(ReadFiles.sixteenOrdered());
		Sorts.insertionSort(ReadFiles.sixteenOrdered());
		System.out.println();
		System.out.println("Sixteen Backwards");
		Sorts.selectionSort(ReadFiles.sixteenBackwards());
		Sorts.bubbleSort(ReadFiles.sixteenBackwards());
		Sorts.insertionSort(ReadFiles.sixteenBackwards());
		System.out.println();
		System.out.println("Sixteen Random");
		Sorts.selectionSort(ReadFiles.sixteenRandom());
		Sorts.bubbleSort(ReadFiles.sixteenRandom());
		Sorts.insertionSort(ReadFiles.sixteenRandom());
		
		System.out.println();
		System.out.println("1-2000");
		System.out.println();
		System.out.println("2000 ordered");
		Sorts.selectionSort(ReadFiles.twoThousandOrdered());
		Sorts.bubbleSort(ReadFiles.twoThousandOrdered());
		Sorts.insertionSort(ReadFiles.twoThousandOrdered());
		System.out.println();
		System.out.println("2000 Backwards");
		Sorts.selectionSort(ReadFiles.twoThousandReverse());
		Sorts.bubbleSort(ReadFiles.twoThousandReverse());
		Sorts.insertionSort(ReadFiles.twoThousandReverse());
		System.out.println();
		System.out.println("2000 Random");
		Sorts.selectionSort(ReadFiles.twoThousandRandom());
		Sorts.bubbleSort(ReadFiles.twoThousandRandom());
		Sorts.insertionSort(ReadFiles.twoThousandRandom());
		
	
	}

}
