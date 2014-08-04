/*
 * Hamburg University of Applied Sciences
 *
 * Programming assignments
 *
 * ngochien.le@haw-hamburg.de
 */
package basis;

/**
 * @author Le
 */
public class ListenBaustein<T> {
	private T inhalt;
	private ListenBaustein<T> rest;

	public ListenBaustein(T inhalt) {
		this.inhalt = inhalt;
	}

	public T getInhalt() {
		return inhalt;
	}

	public ListenBaustein<T> getRest() {
		return rest;
	}

	public ListenBaustein<T> fuegeEin(T inhalt) {
		ListenBaustein<T> neu = new ListenBaustein<T>(inhalt);
		neu.rest = this;
		return neu;
	}

	public static void main(String[] args) {
		ListenBaustein<String> liste = new ListenBaustein<String>("23");
		liste = liste.fuegeEin("42");
		liste = liste.fuegeEin("12");
		System.out.println(liste.inhalt);
		System.out.println(liste.rest.inhalt);
	}
}
