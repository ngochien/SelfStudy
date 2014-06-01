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
public class NestedSynchrn extends Thread {

	private int i;
	synchronized public void plusTen() {
		i = get() + 10;
	}
	synchronized public int get() {
		return i;
	}
	
	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			plusTen();
			DoSomething.pauseRandom(1000);
			System.err.println(Thread.currentThread().getName() + " " + get());
		}
	}
	
	public static void main(String[] args) {
		Thread t1 = new NestedSynchrn();
		Thread t2 = new NestedSynchrn();
		t1.start(); t2.start();
	}

}
