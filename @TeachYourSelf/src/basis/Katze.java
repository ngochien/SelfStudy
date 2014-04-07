package basis;

public class Katze extends Tier {
	
	public Katze() {
		
	}

	public Katze(String name) {
		this.name = name;
		System.out.println("Niedliche " + name + " erzeugt.");
	}
	
	public void macheLaut() {
		System.out.println("Miau Miau");
	}
}
