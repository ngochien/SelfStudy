/**
 * Hamburg University of Applied Sciences
 *
 * Programming assignments
 *
 * ngochien.le@haw-hamburg.de
 */
package thread;

/**
 * A "runnable" runner
 * 
 * @author h13n
 *
 */
public class RunnerRunnable implements Runnable {

	private String name;
	
	public RunnerRunnable(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	@Override
	public void run() {
		Thread runnerThread = new RunnerThread(getName());
		runnerThread.run();
	}
}
