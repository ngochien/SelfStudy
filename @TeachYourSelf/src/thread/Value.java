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
public abstract class Value<V> {

	protected V value;
	
	abstract public void set(V value);
	abstract public V get();
}
