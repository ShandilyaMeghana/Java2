package loops;

import java.util.Scanner;

public class Question3 {
/*Write a program that prompts the user to input a positive integer. 
It should then print the multiplication table of that number. */
	
	public static void main(String[] args) {
		int mul=1;
		Scanner sc= new Scanner(System.in);
		System.out.println("Please enter a number");
		int a= sc.nextInt();
		while(!((a%2)==0)){
			System.out.println("Please enter a positive number");
			a=sc.nextInt();
		}
		System.out.println("The number is positive");
		for (int j=1;j<=10;j++){
			mul=a*j;
			System.out.println(a+"*"+j+"="+mul);
		}

	}

}
