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
class CalculatingThread extends Thread {
	private boolean finished = false;

	@Override
	public void run() {
		long sum = 0;
		while (!finished) {
			sum += 1;
			System.out.println(sum);
		}
	}

	public void setFinished(boolean f) {
		finished = f;
	}
}