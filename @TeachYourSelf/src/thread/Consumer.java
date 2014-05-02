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
public class Consumer extends Thread {

	private Value<Integer> v;
	
	
	public Consumer(Value<Integer> v) {
		this.v = v;
	}

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			int w = v.get();
			System.out.println("Consumer get: " + w);
			DoSomething.pauseRandom(100);
		}
	}

}
