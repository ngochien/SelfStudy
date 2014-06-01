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
 * Simulate a runner
 * @author h13n
 *
 */
public class RunnerThread extends Thread {

	public RunnerThread(String name) {
		super(name);
	}
	
	@Override
	public void run() {
		System.out.println("Runner " + getName() + " started");
		for (int i = 0; i < 3; i++) {
			System.out.println(getName() + " running");
			try {
				sleep((int)(Math.random() * 1000));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println(getName() + " FINISH");
	}
}
