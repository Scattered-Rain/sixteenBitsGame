package render;

/** Generic Class used as the basis for any renderable node in a render tree */
public abstract class RenderNode{
	
	/** Draws Render Node */
	public void draw(){}
	
	/** Updates Render Node */
	public void update(){}
	
	/** Disposes the Node */
	public void dispose(){}
	
}
