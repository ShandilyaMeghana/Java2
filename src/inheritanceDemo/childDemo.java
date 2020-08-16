package inheritanceDemo;

public class childDemo extends ParentDemo {

	public void brake() {
		System.out.println("New Tech in Brake");
	}

	public void speedSafety() {
		System.out.println("enchnaced feature");
	}

	public void navigation() {
		System.out.println("New Navigation");
	}

	public static void main(String[] args) {
		childDemo cd = new childDemo();
	/*Method Overriding-both parent and child 
		have same class name but child method over rides the parent method*/
		cd.brake();
		/*With inheritance we need not define parent object to
		 access methods*/	
		
		cd.speedSafety();
		cd.audiosysteam();

	}

}
