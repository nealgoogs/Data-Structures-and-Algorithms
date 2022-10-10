package homework2;

import java.util.Arrays;

public class Driver {

	public static void main(String[] args) throws Exception {
		
		System.out.println("Sixteen Ordered");
		Sorts.ShellSort(ReadFiles.sixteenOrdered());
		System.out.println();
		System.out.println("Sixteen Backwards");
		Sorts.ShellSort(ReadFiles.sixteenBackwards());
		System.out.println();
		System.out.println("Sixteen Random");
		Sorts.ShellSort(ReadFiles.sixteenRandom());
		System.out.println();
		System.out.println("Sixteen Ordered");
		Sorts.ShellSortV2(ReadFiles.sixteenOrdered());
		System.out.println();
		System.out.println("Sixteen Backwards");
		Sorts.ShellSortV2(ReadFiles.sixteenBackwards());
		System.out.println();
		System.out.println("Sixteen Random");
		Sorts.ShellSortV2(ReadFiles.sixteenRandom());
		System.out.println();
		System.out.println("2000 Ordered");
		Sorts.ShellSort(ReadFiles.twoThousandOrdered());
		System.out.println();
		System.out.println("2000 Backwards");
		Sorts.ShellSort(ReadFiles.twoThousandReverse());
		System.out.println();
		System.out.println("2000 Random");
		Sorts.ShellSort(ReadFiles.twoThousandRandom());
		System.out.println();
		System.out.println("2000 Ordered");
		Sorts.ShellSortV2(ReadFiles.twoThousandOrdered());
		System.out.println();
		System.out.println("2000 Backwards");
		Sorts.ShellSortV2(ReadFiles.twoThousandReverse());
		System.out.println();
		System.out.println("2000 Random");
		Sorts.ShellSortV2(ReadFiles.twoThousandRandom());
		System.out.println();
		
		System.out.println("QUICKSORT");
		
		System.out.println("SIXTEEN ORDERED");
		int intArray[] = ReadFiles.sixteenOrdered();
		int n = intArray.length;
		Sorts.quickSort(intArray,0,n-1);
		System.out.println("Sorted Array: " + Arrays.toString(intArray));
		Sorts.print(intArray);
		System.out.println();
		
		System.out.println("SIXTEEN BACKWARDS");
		int intArray1[] = ReadFiles.sixteenBackwards();
		int n1 = intArray1.length;
		Sorts.quickSort(intArray1,0,n1-1);
		System.out.println("Sorted Array: " + Arrays.toString(intArray1));
		Sorts.print(intArray1);
		System.out.println();
		
		System.out.println("SIXTEEN RANDOM");
		int intArray11[] = ReadFiles.sixteenRandom();
		int n11 = intArray11.length;
		Sorts.quickSort(intArray11,0,n11-1);
		System.out.println("Sorted Array: " + Arrays.toString(intArray11));
		Sorts.print(intArray11);
		System.out.println();
		
		System.out.println("2000 ORDERED");
		int intArray111[] = ReadFiles.twoThousandOrdered();
		int n111 = intArray111.length;
		Sorts.quickSort(intArray111,0,n111-1);
		System.out.println("Sorted Array: " + Arrays.toString(intArray111));
		Sorts.print(intArray111);
		System.out.println();
		
		System.out.println("2000 BACKWARDS");
		int intArray1111[] = ReadFiles.twoThousandReverse();
		int n1111 = intArray1111.length;
		Sorts.quickSort(intArray1111,0,n1111-1);
		System.out.println("Sorted Array: " + Arrays.toString(intArray1111));
		Sorts.print(intArray1111);
		System.out.println();
		
		System.out.println("2000 RANDOM");
		int intArray11111[] = ReadFiles.twoThousandRandom();
		int n11111 = intArray11111.length;
		Sorts.quickSort(intArray11111,0,n11111-1);
		System.out.println("Sorted Array: " + Arrays.toString(intArray11111));
		Sorts.print(intArray11111);
		

	}

}
