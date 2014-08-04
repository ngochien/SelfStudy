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
import javafx.scene.control.CheckMenuItem;
import javafx.scene.control.ContextMenu;
import javafx.scene.control.CustomMenuItem;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuButton;
import javafx.scene.control.MenuItem;
import javafx.scene.control.RadioMenuItem;
import javafx.scene.control.ScrollBar;
import javafx.scene.control.SeparatorMenuItem;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 * @author Le
 */
public class MyMenu extends Application {

	public static void main(String[] args) {
		Application.launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		primaryStage.setTitle("Menus and Co.");
		
		/* Creates all (sub)menus */
		Menu menu1 = new Menu("Menu 1");
		Menu menu2 = new Menu("Menu 2");
		Menu menu3 = new Menu("Menu 3");
		Menu menu31 = new Menu("Menu 3.1");
		
		/* Creates all menu items */
		MenuItem menuItem = new MenuItem("Menu Item");
		
		CheckMenuItem checkMenuItem = new CheckMenuItem("Check Menu Item");
		checkMenuItem.setSelected(true);
		
		CheckMenuItem checkMenuItem11 = new CheckMenuItem("Check Menu Item 1.1");
		CheckMenuItem checkMenuItem12 = new CheckMenuItem("Check Menu Item 1.2");
		CheckMenuItem checkMenuItem13 = new CheckMenuItem("Check Menu Item 1.3");
		
		CustomMenuItem customMenuItem1 = new CustomMenuItem(new Slider());
		CustomMenuItem customMenuItem2 = new CustomMenuItem(new ScrollBar());
		SeparatorMenuItem separatorItem = new SeparatorMenuItem();
		
		/* 
		 * Assign all radio menu items the same value for toggleGroup,
		 * so that only one RadioMenuItem at a time within that group can be selected
		 */
		ToggleGroup toggleGroup = new ToggleGroup();
		
		RadioMenuItem radioMenuItem1 = new RadioMenuItem("Radio Menu Item 1");
		radioMenuItem1.setToggleGroup(toggleGroup);

		RadioMenuItem radioMenuItem2 = new RadioMenuItem("Radio Menu Item 2");
		radioMenuItem2.setToggleGroup(toggleGroup);
		
		RadioMenuItem radioMenuItem3 = new RadioMenuItem("Radio Menu Item 3");
		radioMenuItem3.setToggleGroup(toggleGroup);
		
		/* Adds all items to the appropriate (sub)menus .
		 * The appearance order of these items in the menu bar
		 * is exactly the same as their order in the ObservableList.
		 */
		menu1.getItems().addAll(checkMenuItem11, checkMenuItem12, checkMenuItem13);
		
		menu2.getItems().addAll(customMenuItem1, separatorItem, customMenuItem2);
		
		menu31.getItems().addAll(radioMenuItem1, radioMenuItem2, radioMenuItem3);
		
		menu3.getItems().addAll(menuItem, checkMenuItem, menu31);
		
		/* Creates a menu bar and adds all menus to it*/
		MenuBar menuBar = new MenuBar();
		menuBar.getMenus().addAll(menu1, menu2, menu3);
		
		/* Creates a menu button and adds some menu items to it */
		MenuButton menuButton = new MenuButton("Menu Button");
		
		// It's OK to add a menu item which was added to another menu.
		// This item will be sync.
		menuButton.getItems().addAll(checkMenuItem);
		
		/* Creates a text field with a context menu */
		ContextMenu contextMenu = new ContextMenu(new MenuItem("A Menu Item - Also Context Item"));
		TextField txtField = new TextField("A text field with context menu");
		txtField.setContextMenu(contextMenu);
		
		/* Scene graph, scene and stage.
		 * Note : The menu bar is added to a grid pane which is then added to
		 * a stack pane (the stack pane is the root node of the scene graph),
		 * so that the menu bar will be always be placed at the very top of the scene.
		 * But : Is it necessary to use a stack pane as the root node? Because we can add
		 * the grid pane directly to the scence...
		 */
		GridPane grid = new GridPane();
		grid.add(menuBar, 0, 0);
		grid.add(menuButton, 0, 1);
		grid.add(txtField, 0, 2);
		
		StackPane stackPane = new StackPane(grid);
//		stackPane.getChildren().add(menuBar);	// not necessary?
		Scene scene = new Scene(stackPane);
		primaryStage.setScene(scene);
		primaryStage.show();
	}

}
