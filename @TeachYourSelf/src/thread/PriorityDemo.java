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
class PriorityDemo {
	public static void main(String[] args) {
		BlockingThread bt = new BlockingThread();
		bt.setPriority(Thread.NORM_PRIORITY + 1);
		CalculatingThread ct = new CalculatingThread();
		bt.start();
		System.out.println("Start");
		ct.start();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
		}
		bt.setFinished(true);
//		ct.setFinished(true);
		ct.interrupt();
		System.out.println("End");
	}
}