package arrays;

public class MultidimensionalDemo {

	public static void main(String args[]){
		
		int arr[][]= new int[2][3];
		arr[0][0]=1;
		arr[0][1]=2;
		arr[0][2]=6;
		arr[1][0]=2;
		arr[1][1]=3;
		arr[1][2]=4;
		
		for (int i =0;i<2;i++){
			for (int j=0;j<3;j++){
				System.out.print(arr[i][j]);
			}
			System.out.print("\n");
		}
	}
}
