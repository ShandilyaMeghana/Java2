package importanceof_THIS_and_SUPER;


public class childDemo extends parentDemo{

	String name="Child Ram";
	
	
	public childDemo(){
		super();//for calling parent constructor
		System.out.println(" Inside Child class constructor");
	}
	
	public void getdata(){
		super.getdata();//parent method
		//to access parent method via super due to same name super must be used first place.
		System.out.println("Inside child class");
		System.out.println(name);
		System.out.println(super.name); //super keyword for parent variable
	}
	public static void main(String[] args) {
		/*super keyword does not work inside main method- because in main only static variables can be 
		used and this and super keyword are instance level*/
		childDemo cd=new childDemo();
		cd.getdata();
		
	}

}
