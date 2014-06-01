/**
 * Hamburg University of Applied Sciences
 *
 * Programming assignments
 *
 * ngochien.le@haw-hamburg.de
 */
package thread;

/**
 * @author h13n
 *
 */
public class KartenTerminal extends Thread {

	private KonzertDaten daten;
	
	public KartenTerminal(String name, KonzertDaten daten) {
		super(name);
		this.daten = daten;
	}
	
	public void run() {
		for (int i = 0; i < 50; i++) {
			System.out.println(getName() + ": Sitzplatz " + daten.freierPlatz() + " verkauft");
		}
	}
}
