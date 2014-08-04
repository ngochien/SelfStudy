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
import javafx.scene.control.Slider;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

/**
 * @author Le
 */
public class SliderFrame extends Application {

	public static void main(String[] args) {
		Application.launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {
		stage.setTitle("A cool slider");

		final Label label = new Label();
		final Slider slider = new Slider(0, 10, 0);
		EventHandler<MouseEvent> handler = new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent event) {
				System.out.println(event.getSource());
				int value = (int) slider.getValue();
				label.setText(value + "");
			}
		};
		slider.addEventHandler(MouseEvent.ANY, handler);

		stage.setScene(new Scene(new HBox(10, slider, label), 200, 100));
		stage.show();
	}

}
