/*
 * Hamburg University of Applied Sciences
 *
 * Programming assignments
 *
 * ngochien.le@haw-hamburg.de
 */
package gui.javafx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.ToggleButton;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 * A toggle button, which can be selected.
 * @author Le
 */
public class MyToggleButton extends Application {

	public static void main(String[] args) {
		Application.launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		ToggleButton btn = new ToggleButton("My toggle button");
//		btn.setText("My toggle button");
		
		StackPane root = new StackPane();
		root.getChildren().add(btn);
		
		Scene scence = new Scene(root, 300, 100);
		
		primaryStage.setTitle("Here is the primary stage");
		primaryStage.setScene(scence);
		
		primaryStage.show();
	}

}
