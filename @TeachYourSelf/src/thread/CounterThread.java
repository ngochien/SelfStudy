/**
 * Hamburg University of Applied Sciences
 *
 * Programming assignments
 *
 * ngochien.le@haw-hamburg.de
 */
package thread;

/**
 * 
 * A simple thread that prints out numbers from 1 to 10 to the console
 * 
 * @author h13n
 *
 */
public class CounterThread  extends Thread {

	@Override
	public void run() {
		System.out.println("Counter thread started");
		for (int i = 1; i < 20; i++) {
			System.out.println(i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				System.err.println("Error while sleeping");
				interrupt();
			}
		}
	}
}
