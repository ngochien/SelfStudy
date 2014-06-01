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
public class ReadWriteProblem {

	public static void main(String[] args) {
		Figure f = new BadFigure();
		Thread read = new ReadThread(f);
		Thread write = new WriteThread(f);
		write.setDaemon(true);
		write.start();
		read.start();
	}
}
