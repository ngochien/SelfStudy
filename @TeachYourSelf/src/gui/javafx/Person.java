/*
 * Hamburg University of Applied Sciences
 *
 * Programming assignments
 *
 * ngochien.le@haw-hamburg.de
 */
package gui.javafx;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 * @author Le
 */
public class Person {

	private StringProperty alias;
	private StringProperty firstName;
	private StringProperty lastName;

	public Person( String alias, String firstName, String lastName) {
		this.alias = new SimpleStringProperty(this, "alias");
		this.alias.setValue(alias);
		firstNameProperty().setValue(firstName);
		lastNameProperty().setValue(lastName);
	}

	// public StringProperty aliasProperty() {
	// if (alias == null) {
	// alias = new SimpleStringProperty(this, "alias");
	// }
	// return alias;
	// }

	public String getAlias() {
		return alias.getValue();
	}

	public StringProperty firstNameProperty() {
		if (firstName == null) {
			firstName = new SimpleStringProperty(this, "firstName");
		}
		return firstName;
	}

	public String getFirstName() {
		return firstName.getValue();
	}

	public StringProperty lastNameProperty() {
		if (lastName == null) {
			lastName = new SimpleStringProperty(this, "lastName");
		}
		return lastName;
	}

	public String getLastName() {
		return lastName.getValue();
	}

	@Override
	public String toString() {
		return getAlias() + " - " + getFirstName() + " " + getLastName();
	}
}
