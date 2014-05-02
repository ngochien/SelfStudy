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
public class KonzertDaten {

	private int sitzPlatz;
	
	public int freierPlatz() {
//		int n = sitzPlatz;
		DoSomething.pause(10);
		return ++sitzPlatz;
	}
}
