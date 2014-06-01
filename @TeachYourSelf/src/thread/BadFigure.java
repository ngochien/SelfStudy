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
public class BadFigure extends Figure {

	@Override
	synchronized public void setPosition(char x, int y) {
		this.x = x;
		DoSomething.pause(100);
		this.y = y;
	}

	@Override
	synchronized public String getPosition() {
		DoSomething.pause(100);
		return "(" + x + "," + y + ")";
	}

}
