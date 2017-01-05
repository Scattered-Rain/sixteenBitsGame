package util.gdx;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import util.Point;

/** Any kind of Renderable which relies on a SpriteBatch to be rendered */
public abstract class SpriteImage{
	
	/** The generic Render call (based on center of Image) */
	public abstract void draw(SpriteBatch batch, Point loc);
	
	/** Returns Point of the dimensions of this Image in the form [width, height] */
	public abstract Point getDimensions();
	
}
