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
public class ReadThread extends Thread {
	
	private Figure figure;
	
	public ReadThread(Figure figure) {
		this.figure = figure;
	}
	
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(figure.getPosition());
		}
	}
}
