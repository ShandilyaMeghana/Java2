package basics;

public class NestedLoops {

	public static void main(String[] args) {
		int k=0;
		for (int i=3;i>=0;i--){
			for (int j=0;j<=i;++j){
				System.out.print(++k);
			}
			System.out.print("\n");
		}

	}

}
