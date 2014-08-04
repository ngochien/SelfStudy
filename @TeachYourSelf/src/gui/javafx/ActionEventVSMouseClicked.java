/*
 * Hamburg University of Applied Sciences
 *
 * Programming assignments
 *
 * ngochien.le@haw-hamburg.de
 */
package gui.javafx;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * @author Le
 */
public class ActionEventVSMouseClicked extends Application {

	@Override
	public void start(Stage stage) {
		stage.setTitle("Action Event OR MOUSE_CLICKED?");

		Button btn1 = new Button("Button 1");
		btn1.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				System.out.println("Action Event: " + event);
			}
		});

		// Button btn2 = new Button("Button 2");
		btn1.setOnMouseClicked(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent event) {
				System.out.println("Mouse Event: " + event);
			}
		});

		TextField txtField = new TextField("Enter here");
		txtField.addEventHandler(ActionEvent.ACTION,
				new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				System.out.println("Action event on text field: "
						+ event);
			}
		});

		txtField.setOnMouseClicked(new EventHandler<MouseEvent>() {
					@Override
					public void handle(MouseEvent event) {
						System.out.println("Action event on text field: " + event);
					}
				});

		stage.setScene(new Scene(new VBox(btn1, txtField)));
		stage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}

}
