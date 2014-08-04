/*
 * Hamburg University of Applied Sciences
 *
 * Programming assignments
 *
 * ngochien.le@haw-hamburg.de
 */
package gui.javafx;


import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.CheckMenuItem;
import javafx.scene.control.ContextMenu;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * @author Le
 */
public class MyTable extends Application {

	private ObservableList<Person> people = FXCollections.observableArrayList();

	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle("My Table");

		GridPane grid = new GridPane();
		grid.setPadding(new Insets(5));
		grid.setHgap(5);
		grid.setVgap(5);
		// grid.getChildren().add(peopleTable()); // OK but other method add is
		// convenience and should be used.
		TableView<Person> t = peopleTable();
		// grid.add(new Label("Label"), 0, 0);
		// grid.add(t, 0, 1);

		grid.getChildren().addAll(t, new Label("Label"));
		VBox.setVgrow(grid, Priority.ALWAYS);
		Scene scene = new Scene(grid);
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public TableView<Person> peopleTable() {
		/* Creates a table view, sets size and generates test data */
		TableView<Person> peopleTable = new TableView<>(getPeople());
		peopleTable.setPrefSize(300, 500);
		generateTableData();

		/* Creates all needed columns and maps to generated data */
		TableColumn<Person, String> aliasCol = new TableColumn<>("Alias");
		aliasCol.setCellValueFactory(new PropertyValueFactory<Person, String>("alias"));
		aliasCol.setPrefWidth(100);
		aliasCol.setContextMenu(new ContextMenu(new CheckMenuItem("Alias Context Menu")));

		TableColumn<Person, String> firstNameCol = new TableColumn<>("First name");
		firstNameCol.setCellValueFactory(new PropertyValueFactory<Person, String>("firstName"));
		firstNameCol.setPrefWidth(100);

		TableColumn<Person, String> lastNameCol = new TableColumn<>("Last name");
		lastNameCol.setCellValueFactory(new PropertyValueFactory<Person, String>("lastName"));
		lastNameCol.setPrefWidth(100);

		//		peopleTable.getColumns().setAll(aliasCol, firstNameCol, lastNameCol);

		/* Adds all columns to the table view */
		peopleTable.getColumns().add(aliasCol);
		peopleTable.getColumns().add(firstNameCol);
		peopleTable.getColumns().add(lastNameCol);

		return peopleTable;
	}

	private void generateTableData() {
		Person profX = new Person("Professor X", "Giao su", "X");
		Person wolf = new Person("Wolf", "Nguoi", "Soi");
		Person monster = new Person("Monster", "Quai", "Vat");
		addPeople(profX, wolf, monster);

		addPerson("Author", "Hien", "Le");
	}

	public void addPerson(String alias, String firstName, String lastName) {
		people.add(new Person(alias, firstName, lastName));
	}

	public void addPeople(Person... people) {
		this.people.addAll(people);
	}

	public ObservableList<Person> getPeople() {
		return people;
	}

	public static void main(String[] args) {
		Application.launch(args);
	}

}
