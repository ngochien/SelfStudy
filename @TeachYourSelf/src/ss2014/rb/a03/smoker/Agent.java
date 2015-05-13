/*
 * Hamburg University of Applied Sciences
 *
 * Programming assignments
 *
 * ngochien.le@haw-hamburg.de
 */

package ss2014.rb.a03.smoker;

/**
 * Der Agent legt zwei zufällig ausgewählte Zutaten auf den gemeinsamen Tisch.
 * 
 * @author Le, Nguyen.
 */
public class Agent implements Runnable {

	private Table table;

	public Agent(Table table) {
		this.table = table;
	}

	@Override
	public void run() {
		while (!Thread.currentThread().isInterrupted()) {

			/* Wähle zufällig zwei Zutaten */
			Item item1 = Item.random();
			Item item2 = Item.random();
			while (item1 == item2) {
				item2 = Item.random();
			}

			/* Lege zwei gewählte Zutaten auf den Tisch */
			table.put(item1, item2);
		}
	}
}
