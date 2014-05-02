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
public abstract class Figure {

	protected char x;
	protected int y;
	abstract public void setPosition(char x, int y);
	abstract public String getPosition();
}
