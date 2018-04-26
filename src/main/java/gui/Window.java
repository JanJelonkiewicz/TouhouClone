package gui;

import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Window
{
	// TODO: Move constants to separate class
	private static final String TITLE = "TouhouClone";
	private static final double WIDTH = 800;
	private static final double HEIGHT = 600;
	
	private Canvas canvas;
	
	public void start(Stage stage)
	{
		StackPane layout = new StackPane();
		
		canvas = new Canvas(WIDTH, HEIGHT);
		layout.getChildren().add(canvas);
		
		stage.setTitle(TITLE);
		stage.setScene(new Scene(layout, WIDTH, HEIGHT));
		stage.show();
	}
	
	public Canvas getCanvas()
	{
		return canvas;
	}
}
