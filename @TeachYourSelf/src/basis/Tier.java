package basis;

public abstract class Tier {
	
	protected String name = "Tier";
	
	public Tier() {
		System.out.println("Tier erzeugt.");
	}
	
	public Tier(String name) {
		this.name = name;
		System.out.println(name + " erzeugt.");
	}

	public void macheLaut() {
		System.out.println(name + "-Laut");
	}
}
