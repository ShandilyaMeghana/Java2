package example_Interface;

public class IndianTrafficRules implements UniversalTrafficRules{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IndianTrafficRules iTraffic= new IndianTrafficRules();
		iTraffic.redStop();
		iTraffic.flashingYellow();
		iTraffic.greenGo();

	}

	@Override
	public void redStop() {
		// TODO Auto-generated method stub
		System.out.println(" Stop at Red Signal");
	}

	@Override
	public void greenGo() {
		// TODO Auto-generated method stub
		System.out.println(" Go at Green Signal");
	}

	@Override
	public void flashingYellow() {
		// TODO Auto-generated method stub
		System.out.println("Wait during Yellow signal");
	}

}
