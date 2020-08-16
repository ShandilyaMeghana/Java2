package importanceof_THIS_and_SUPER;

public class ThisDemo {

	int a= 5;//global variable
	
	public void demo(){
		int a =3;//local variable 
		System.out.println(a);//this will print local variable as local is given preference and overidden
		System.out.println(this.a);
		//due to this global variable is accessible
	}
	public static void main(String[] args) {
		
		ThisDemo td=new ThisDemo();
		td.demo();
		

	}

}
