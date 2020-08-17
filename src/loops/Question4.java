package loops;

import java.util.Scanner;

public class Question4 {
//Write a program to find the factorial value of any number entered through the keyboard. 
	public static void main(String[] args) {
		int m = 0;
		int fact=1;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number whose factorial is required");
		m=sc.nextInt();
		for (int i=1;i<=m;i++){
			fact*=i;
		}
System.out.println("The factorial of number is"+m+"="+fact);
	}

}
