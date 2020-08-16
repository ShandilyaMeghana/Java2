package arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int ar[]={2,9,4,5,7,1};
		int temp=0;
		
		for (int i=0;i<4;i++){
			if (ar[i]>ar[i+1]){
				temp=ar[i];
				ar[i]=ar[i+1];
				ar[i+1]= temp;
			}
			
		}
for (int k=0;k<ar.length;k++){
	System.out.println(ar[k]);
}
	}

}
