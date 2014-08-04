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
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * @author Le
 */
public class PercentageDemo extends Application {

	public static void main(String[] args) {
		Application.launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle("Progress Demo");

		// The root node
		final VBox root = new VBox();

		// Label and Task
		final Label label = new Label();
		final SampleTask task = new SampleTask(label);

		// Progress bar
		final ProgressBar progress = new ProgressBar();
		progress.setPrefSize(200, 20);
		progress.progressProperty().bind(task.progressProperty());

		// Cancel button - task will be cancelled by clicking this button
		final Button cancelButton = new Button("Cancel");
		cancelButton.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				task.cancel();
				root.getChildren().removeAll(cancelButton);
			}
		});

		// Exit button
		Button exitButton = new Button("Exit");
		exitButton.setCancelButton(true); // Exit when ESC is pressed
		exitButton.addEventHandler(ActionEvent.ACTION,
				new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				System.exit(0);
			}
		});
		// Exit when a key is pressed
		exitButton.setOnKeyPressed(new EventHandler<KeyEvent>() {
			@Override
			public void handle(KeyEvent event) {
				System.exit(0);
			}
		});

		/* Here an alternative */
		// exitButton.setOnAction(new EventHandler<ActionEvent>() {
		// @Override
		// public void handle(ActionEvent event) {
		// task.cancel();
		// System.exit(0);
		// }
		// });

		// Start button
		final Button startButton = new Button("Start");
		startButton.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent event) {
				root.getChildren().add(1, cancelButton);
				root.getChildren().add(2, progress);
				root.getChildren().add(3, label);
				root.getChildren().removeAll(startButton);
				new Thread(task).start();
			}
		});

		root.getChildren().addAll(startButton, exitButton);
		root.setAlignment(Pos.CENTER);

		primaryStage.setScene(new Scene(root, 220, 120));
		primaryStage.show();
	}

}
