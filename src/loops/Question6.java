package loops;

public class Question6 {
	/*
	 * Write a program that reads a set of integers, and then prints the sum of
	 * the even and odd integers.
	 */
	public static void main(String[] args) {

		int a[] = { 1,2,3,4,5,6,7,8,9 };
		int even=0;
		int odd=0;
for (int i=0;i<a.length;i++){
	if (a[i]%2==0){
		even+=a[i];
	}
	else{
		odd+=a[i];
	}
}
System.out.println("Even="+ even+ "\t Odd="+odd);
	}

}
