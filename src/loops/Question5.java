package loops;

import java.util.Scanner;

public class Question5 {
/*Write a program that prompts the user to input an integer and then outputs the number with the digits reversed. 
 * For example, if the input is 12345, the output should be 54321
 * 
 * Algorithm
 * 
 * 
 */
	public static void main(String[] args) {
		int num=0;
		System.out.println("Enter a Number");
		Scanner sc= new Scanner(System.in);
		num=sc.nextInt();
		while(num>0){
			System.out.print(num%10);
			num=num/10;
			
		}
		
		}

	}


