/*
 * Hamburg University of Applied Sciences
 *
 * Programming assignments
 *
 * ngochien.le@haw-hamburg.de
 */
package gui.javafx;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 * @author Le
 */
public class EventAndCo extends Application {

	public static void main(String[] args) {
		Application.launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle("Events and Co.");

		Label label = new Label("Move mouse here");
		label.setStyle("-fx-border-width:1; -fx-border-color:red; -fx-font:20 Arial;");

		label.addEventHandler(MouseEvent.MOUSE_MOVED, new MouseEventHandler());
		label.addEventHandler(MouseEvent.MOUSE_CLICKED,
				new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent event) {
				System.exit(0);
			}
		});

		// label.setOnMouseMoved(new MouseEventHandler());

		primaryStage.setScene(new Scene(new StackPane(label), 300, 200));
		primaryStage.show();
	}
}