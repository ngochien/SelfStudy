package basis;

public class TierAnwendung {

	public static void main(String[] args) {

		Tier hund = new Hund();
		hund.macheLaut();
		
		Tier katze = new Katze("Katze");
		katze.macheLaut();
	}

}
