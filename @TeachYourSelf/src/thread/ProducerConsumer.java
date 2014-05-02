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
public class ProducerConsumer {

	public static void main(String[] args) {

		Value<Integer> v = new IntValue();
		Producer p = new Producer(v);
		Producer p1 = new Producer(v);
		Producer p2 = new Producer(v);
		Consumer c = new Consumer(v);
		Consumer c1 = new Consumer(v);
		Consumer c2 = new Consumer(v);

		p.start();
		p1.start();
		p2.start();
		c.start();
		c1.start();
		c2.start();
	}

}
