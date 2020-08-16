package arrays;

public class printSmallestNumberInMatrix {

	public static void main(String[] args) {
		int arr[][] = { { 1, 2, 3 }, { 1, 9, -1 }, { 2, 4, 6 } };
		int smallest = arr[0][0];
		int mincol = 0;
		int maxno = 0;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (arr[i][j] < smallest) {

					smallest = arr[i][j];
					mincol = j;
				}
				System.out.print(arr[i][j]);
			}
			System.out.println(" ");
		}
		// System.out.println(smallest);

		for (int k = 0; k < 3; k++) {
			if (arr[k][mincol] > maxno) {
				maxno = arr[k][mincol];

			}
		}
		System.out
				.println("The largest noumber within same column of smallest number is"
						+ maxno);
	}

}
