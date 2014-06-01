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
public class UseTerminals {

	public static void main(String[] args) {
		KonzertDaten daten = new KonzertDaten();
		KartenTerminal t1 = new KartenTerminal("Terminal 1", daten);
		KartenTerminal t2 = new KartenTerminal("Terminal 2", daten);
		t1.start(); t2.start();
	}

}
