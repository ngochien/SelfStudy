/*
 * Hamburg University of Applied Sciences
 *
 * Programming assignments
 *
 * ngochien.le@haw-hamburg.de
 */
package gui.javafx;

import javafx.application.Platform;
import javafx.concurrent.Task;
import javafx.scene.control.Label;

/**
 * @author Le
 */
public class SampleTask extends Task<Boolean> {

	private Label label;

	public SampleTask(Label label) {
		this.label = label;
	}

	@Override
	protected Boolean call() throws Exception {
		try {
			updateLabel("Waiting...");
			Thread.sleep(3000); // Wait a moment (for example : preparing data)
		} catch (InterruptedException e) {
			if (isCancelled()) {
				updateLabel("Cancelled");
				return false;
			}
		}

		final int percent = 100;
		for (int i = 1; i <= percent; i++) {
			try {
				Thread.sleep(100); // Processing data
			} catch (InterruptedException e) {
				if (isCancelled()) {
					updateLabel(i + "%" + " - Cancelled");
					return false;
				}
			}
			updateProgress(i, percent);
			updateLabel(i + "%");
		}

		updateLabel("Done");
		return true;
	}

	private void updateLabel(final String text) {
		Platform.runLater(new Runnable() {
			@Override
			public void run() {
				label.setText(text);
			}
		});
	}
}
