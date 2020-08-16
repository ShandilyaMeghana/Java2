package basics;

public class ReverseString {

	public static void main(String[] args) {
		// To Print Reverse of String Or Find whether a string is palindrome or
		// not
		String s = "hot";
		String t = "";

		for (int i = s.length()-1; i >= 0; i--) {
			System.out.print(s.charAt(i));
			/*
			 * String is presented as array of characters so s[i] will give
			 * error as i is representing the integer value not actual
			 * character. Hence the method charAt(index) would be used
			 */
			t = t + s.charAt(i);
		}
		if (t.equals(s)) {
			System.out.println(" \nThe String " + s + " is a palindrome");
		} else {
			System.out.println("\nThe String is " + s + " not a Palindrome turns out to be "+t);
		}
	}

}
