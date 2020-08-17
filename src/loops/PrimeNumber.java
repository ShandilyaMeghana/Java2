package loops;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		int num = 0;
		int flag = 0;
		String result = null;
		Scanner sc = new Scanner(System.in);
		System.out.println("To find whether the number is prime or not");
		num = sc.nextInt();
		System.out.println(num + " is not prime number");
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				System.out.println(num + " is not prime number");
				flag = 1;
				break;
			}

		}
		if (flag == 0) {
			System.out.println(num + " is prime number");
		}

	}

}
