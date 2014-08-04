/*
 * Hamburg University of Applied Sciences
 *
 * Programming assignments
 *
 * ngochien.le@haw-hamburg.de
 */
package gui.javafx;

import java.net.URL;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/**
 * @author Le
 */
public class CSSSample extends Application {

	@Override
	public void start(Stage primaryStage) {
		primaryStage.setTitle("CSS eXAMPLE");
		
		GridPane grid = new GridPane();
		grid.setHgap(10);
		grid.setVgap(10);
		grid.setPadding(new Insets(5));
		Label label = new Label("A label");
		Label formattedLabel = new Label("Formatted label");
		grid.add(label, 0, 0);
		GridPane.setHalignment(label, HPos.CENTER);
		grid.add(formattedLabel, 0, 1);
		format(formattedLabel, "h13n.css");
		
		primaryStage.setScene(new Scene(grid));
		primaryStage.show();
	}
	
	private void format(Parent parent, String CSSfileName) {
		ObservableList<String> cssStyle = loadCSS(CSSfileName);
		if (cssStyle != null) {
			parent.getStylesheets().addAll(cssStyle);
		} else {
			System.out.println("Failed to load CSS file.");
		}
	}
	
	private ObservableList<String> loadCSS(String CSSfileName) {
		ObservableList<String> cssStyle = FXCollections.observableArrayList();
		URL url = getClass().getResource(CSSfileName);
		if (url == null) {
			return null;
		}
		cssStyle.addAll(url.toExternalForm());
		return cssStyle;
	}
	
	public static void main(String[] args) {
		Application.launch(args);
	}

}
