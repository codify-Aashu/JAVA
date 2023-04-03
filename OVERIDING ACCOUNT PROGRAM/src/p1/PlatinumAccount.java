package p1;

public class PlatinumAccount extends GoldAccount{

	@Override
	public void rateofinterest(){
		System.out.println("6%");
		
	}

	@Override
	public void minimumbalance() {
		System.out.println("RS 50,000");
		
	}
	public static void main(String[] args) {
		GoldAccount g = new GoldAccount();
		g.onlineBanking();
		g.rateofinterest();
		g.minimumbalance();
		
		PlatinumAccount p = new PlatinumAccount();
		p.onlineBanking();
		p.rateofinterest();
		p.minimumbalance();
		
		
		
	}

}
