package homework1;

public class RecursiveBinarySearch {
	
	public static boolean binarySearch (int[]list, int target) {
	
		boolean result = false;
		int low = 0;
		int high = list.length-1;
		int middle;
		
		while (low <= high) {
			middle = (low + high)/2;
			if (list[middle]== target) {
				result = true;
				return result;
			}
			
			else
				if(list[middle]<target)
					low = middle + 1;
				else
					high = middle - 1;
		}
		return result;
	} 
}
