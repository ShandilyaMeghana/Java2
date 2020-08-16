package exceptions;

public class ExceptionDemo {

	public static void main(String[] args) {
		int a=5;
		int b=0;
		
		try{
		int c=a/b;
		System.out.println(c);
		}
		catch(ArithmeticException ae){
			System.out.println("Catched Arithemtic exception");
		}
		catch(Exception e){
			System.out.println("General Exception");
		}
		
		int arr[]= new int[5];
		try{
		System.out.println( arr[7]);
		}
		catch (IndexOutOfBoundsException ib){
			System.out.println("Index out of Bound Exception");
		}
		
		finally{
			//this block of code exceutes irrespective of exceptions and errors. Before the code gets terminated.
			System.out.println("Hello from Finally. Nice Meeting you");
		}

	}

}
