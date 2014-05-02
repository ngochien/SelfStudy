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
 *  A "runnable" class that prints out the first 10 letters (A-J) to console
 *  
 * @author h13n
 *
 */
public class LetterPrinter implements Runnable {

	@Override
	public void run() {
//		System.out.println("LetterPrinter started");
		for (char c = 'A'; c <= 'Z'; c++) {
			System.err.print(c);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
