/**
 * Hamburg University of Applied Sciences
 *
 * Programming assignments
 *
 * ngochien.le@haw-hamburg.de
 */
package thread;

import javax.swing.JOptionPane;

/**
 * 
 * Input of user
 * 
 * @author h13n
 * 
 */
public class UserInputThread extends Thread {

	@Override
	public void run() {
		
		DoSomething.pause(5000);
		if (isInterrupted()) {
			System.out.println("Thread was interrupted hehe");
		} else {
//			DoSomething.pause(1000);
			String input = JOptionPane.showInputDialog("Enter something");
			System.out.println(input);
		}
	}
}
