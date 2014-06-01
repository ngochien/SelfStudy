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
public class WriteThread extends Thread {

	private Figure figure;

	public WriteThread(Figure figure) {
		this.figure = figure;
	}

	@Override
	public void run() {
		while (true) {
			int i = (int) (Math.random() * 8); // 0 ... 7
			char x = (char) (i + 'A'); // A ... H
			int y = i + 1; // 1 ... 8
			figure.setPosition(x, y);
		}
	}
}
