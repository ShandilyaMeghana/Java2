package collection_ArrayListandSet;

import java.util.ArrayList;

public class UniqueNo {

	public static void main(String[] args) {

		int a[] = { 1,2,3,45,6,2,3,3,2,45,2,2,3,6};
		// to print unique number form the array
		/*
		 * Algorithm We create amother arraylist to count numbers from the
		 * existing array We will only fetch number form array element by
		 * element n check the array how many times the element is present.
		 */

		ArrayList<Integer> arr = new ArrayList<Integer>();

		for (int i = 0; i < a.length; i++) {
			int k = 0;
			// To push only the element inside ArrayList which is unique
			if (!arr.contains(a[i])) {
				arr.add(a[i]);

				// to count number of times the same number is repeated
				for (int j = i + 1; j < a.length; j++) {

					if (a[i] == a[j]) {
						k++;
					}

				}
				System.out.println(a[i]+" "+k);
			}
			
		}
	}

}
