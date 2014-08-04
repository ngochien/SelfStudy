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
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 * @author Le
 */
public class ControlComponent extends Application {

	public static void main(String[] args) {
		Application.launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle("Component and layout");

		Button button = new Button("Button");
		
		ComboBox<String> comboBox = new ComboBox<>
					(FXCollections.observableArrayList("Choice 1", "Choice 2", "Choice 3"));
		comboBox.setValue("Other choice");
		
		CheckBox checkBox = new CheckBox("Check box");
		checkBox.setSelected(true);
		
		TextField txtField = new TextField("Text Field");
		// How to resize text field to text length? (automatically?)
		
		GridPane grid = new GridPane();
		grid.setPadding(new Insets(5));		// border outside
		grid.setHgap(10);
		grid.setVgap(10);
		grid.add(comboBox, 0, 0);
		grid.add(checkBox, 1, 0);
		grid.add(txtField, 0, 1);
		grid.add(button, 1, 1);
		
		StackPane stackPane = new StackPane(grid);
//		stackPane.getChildren().add(grid);	// not necessary?
		Scene scene = new Scene(stackPane, 300, 100);
		primaryStage.setScene(scene);
		primaryStage.show();
	}

}
