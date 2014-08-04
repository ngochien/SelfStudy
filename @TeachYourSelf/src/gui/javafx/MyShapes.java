/*
 * Hamburg University of Applied Sciences
 *
 * Programming assignments
 *
 * ngochien.le@haw-hamburg.de
 */
package gui.javafx;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.effect.DropShadow;
import javafx.scene.effect.Reflection;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.CubicCurve;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.LineTo;
import javafx.scene.shape.MoveTo;
import javafx.scene.shape.Path;
import javafx.scene.shape.QuadCurveTo;
import javafx.scene.shape.Shape;
import javafx.stage.Stage;

/**
 * @author Le
 */
public class MyShapes extends Application {

	public static void main(String[] args) {
		Application.launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle("Some cool shapes");

		GridPane grid = new GridPane();
		grid.setPadding(new Insets(10));
		grid.setHgap(20);
		grid.setVgap(20);
		addCurve(grid);
		addIceCream(grid);
		addDonut(grid);
		addZigzag(grid);
		addImage(grid);
		addHaus(grid);
		grid.add(new Button("Button"), 0, 1);

		primaryStage.setScene(new Scene(grid, 650, 650));
		primaryStage.show();
	}

	private void addCurve(Pane parentPane) {
		CubicCurve curve = new CubicCurve();

		curve.setStartX(0);
		curve.setStartY(0);

		curve.setEndX(500);
		curve.setEndY(-50);

		curve.setControlX1(300);
		curve.setControlY1(-400);

		curve.setControlX2(300);
		curve.setControlY2(300);

		curve.setFill(Color.RED);
		curve.setStroke(Color.GREEN);
		// curve.setStrokeType(StrokeType.CENTERED);
		curve.setStrokeWidth(3);

		parentPane.getChildren().add(curve);
	}

	private void addIceCream(Pane parentPane) {
		Path path = new Path();

		MoveTo moveTo = new MoveTo(0, 100);

		QuadCurveTo quadCurveTo = new QuadCurveTo(50, 0, 100, 100);

		LineTo lineTo1 = new LineTo(0, 100);
		LineTo lineTo2 = new LineTo(50, 200);
		LineTo lineto3 = new LineTo(100, 100);

		path.getElements().addAll(moveTo, quadCurveTo, lineTo1, lineTo2,
				lineto3);
		path.setFill(Color.ORANGE);
		path.setStroke(Color.CHOCOLATE);
		path.setStrokeWidth(3);
		path.setTranslateX(100);
		path.setTranslateY(150);

		parentPane.getChildren().add(path);
	}

	private void addDonut(Pane parentPane) {
		Ellipse outside = new Ellipse(100, 100, 50, 30);
		Ellipse inside = new Ellipse(100, 100, 20, 10);

		DropShadow drop = new DropShadow(10, 3, 3, Color.ORANGERED);
		// Reflection reflec = new Reflection(5, 0.5, 0.1, 0.1);

		Shape donut = Shape.subtract(outside, inside);
		donut.setStroke(Color.ORANGERED);
		donut.setStrokeWidth(3);
		donut.setFill(Color.ORANGE);
		donut.setEffect(drop);
		// donut.setEffect(reflec);

		donut.setTranslateX(300);
		donut.setTranslateY(150);

		parentPane.getChildren().add(donut);
	}

	private void addZigzag(Pane parentPane) {

		MoveTo moveTo = new MoveTo(0, 0);

		LineTo lineTo1 = new LineTo(100, 0);

		LineTo lineTo2 = new LineTo(0, 100);
		LineTo lineTo3 = new LineTo(100, 100);

		Path path = new Path(moveTo, lineTo1, lineTo2, lineTo3);
		path.setStroke(Color.RED);
		path.setStrokeWidth(3);
		path.setEffect(new DropShadow(10, 3, 3, Color.ORANGERED));
		path.setTranslateX(500);
		path.setTranslateY(150);

		parentPane.getChildren().add(path);
	}

	private void addImage(Pane parentPane) {
		String filename = "/media/sda6/Bilder/foto.jpg";
		Image image = null;
		try {
			image = new Image(new FileInputStream(new File(filename)));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		ImageView iview = new ImageView(image);
		iview.setFitHeight(100);
		iview.setPreserveRatio(true);
		iview.setSmooth(true);
		iview.setCache(true);
		iview.setTranslateX(550);

		parentPane.getChildren().add(iview);
	}

	private void addHaus(Pane parentPane) {
		MoveTo moveTo = new MoveTo(0, 100);

		LineTo line1 = new LineTo(50, 50);
		LineTo line2 = new LineTo(100, 100);
		LineTo line3 = new LineTo(0, 100);
		LineTo line4 = new LineTo(0, 200);
		LineTo line5 = new LineTo(100, 200);
		LineTo line6 = new LineTo(100, 100);

		Path path = new Path(moveTo, line1, line2, line3, line4, line5, line6);
		path.setEffect(new Reflection(3, 1, 0.8, 0.01));
		path.setFill(Color.RED);
		path.setStroke(Color.BLACK);
		path.setStrokeWidth(1);

		path.setTranslateX(300);
		path.setTranslateY(300);

		parentPane.getChildren().add(path);
	}
}
