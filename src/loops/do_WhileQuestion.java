package loops;

import java.util.Scanner;

public class do_WhileQuestion {
	/*
	 * Write a program to enter the numbers till the user wants and at the end
	 * it should display the count of positive, negative and zeros entered.
	 */
	public static void main(String[] args) {
		char ans = 0;
		int pos=0,neg=0,zero=0,num=0;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Please enter the number");
			num=sc.nextInt();
			if(num==0){
				
			}

		} while (ans == 'Y'||ans=='y');

	}
}
