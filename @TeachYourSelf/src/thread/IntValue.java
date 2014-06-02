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
public class IntValue extends Value<Integer> {

	private boolean valueReady;
	
	@Override
	synchronized public void set(Integer value) {
//		while (valueReady) {
		this.value = value;
		System.out.println("Value ready");
		notify();
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
//		}
		
//		valueReady = true;
		
	}

	@Override
	synchronized public Integer get() {
//		while (!valueReady) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
//		}
//		valueReady = false;
		notify();
		return value;
	}

}
