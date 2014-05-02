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
public class Producer extends Thread {

	private Value<Integer> v;
	
	public Producer(Value<Integer> v) {
		this.v = v;
	}

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			v.set(i);
			System.out.println("Producer set: " + i);
			DoSomething.pauseRandom(100);
		}
	}
}
