/*
 * Hamburg University of Applied Sciences
 *
 * Programming assignments
 *
 * ngochien.le@haw-hamburg.de
 */
package gui.javafx;

import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;

/**
 * @author Le
 */
public class MouseEventHandler implements EventHandler<MouseEvent> {

	@Override
	public void handle(MouseEvent event) {
		System.out.println(event.getSceneX() + " - " + event.getSceneY());
	}

}
