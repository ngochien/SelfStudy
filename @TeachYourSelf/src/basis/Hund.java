package basis;

public class Hund extends Tier {
	
	public Hund() {
		super("Hund");
	}
	
	public void macheLaut() {
		super.macheLaut();
		System.out.println("Wuff Wuff");
	}

}
