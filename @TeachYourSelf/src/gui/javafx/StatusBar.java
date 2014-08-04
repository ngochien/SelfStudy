/*
 * Hamburg University of Applied Sciences
 *
 * Programming assignments
 *
 * ngochien.le@haw-hamburg.de
 */
package gui.javafx;

import javafx.application.Application;
import javafx.beans.property.FloatProperty;
import javafx.beans.property.SimpleFloatProperty;
import javafx.scene.Scene;
import javafx.scene.control.ProgressBar;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/**
 * @author Le
 */
public class StatusBar extends Application {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		launch(args);
	}

	/* (non-Javadoc)
	 * @see javafx.application.Application#start(javafx.stage.Stage)
	 */
	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle("Status bar");
		final FloatProperty value = new SimpleFloatProperty(0);
		ProgressBar bar = new ProgressBar();
		bar.progressProperty().bind(value);
		new Thread(){
			@Override
			public void run() {
				while (value.getValue() < 1.0f) {
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {}
					value.setValue(value.getValue() + 0.1f);
				}
			}
		}.start();

		GridPane grid = new GridPane();
		grid.add(bar, 0, 0);

		primaryStage.setScene(new Scene(grid, 200, 100));
		primaryStage.show();
	}

}
