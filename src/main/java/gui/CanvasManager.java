package gui;

import javafx.scene.canvas.GraphicsContext;

public class CanvasManager
{
	private GraphicsContext graphicsContext;
	
	public CanvasManager(GraphicsContext graphicsContext)
	{
		this.graphicsContext = graphicsContext;
	}
	
	public void drawSprite(Sprite sprite)
	{
		graphicsContext.drawImage(sprite.images[sprite.imageId], sprite.x, sprite.y, sprite.w, sprite.h);
	}
	
	public GraphicsContext getGraphicsContext()
	{
		return graphicsContext;
	}
}
