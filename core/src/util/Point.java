package util;

import com.badlogic.gdx.math.Vector2;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
/** This Object represents an (immutable) Point of two Integer Values */
public class Point{
	
	/** The X value of this Point */
	@Getter private int x;
	/** The Y value of this Point */
	@Getter private int y;
	
	
	/** Constructs new Point with X=Y */
	public Point(int xy){
		this(xy, xy);
	}
	
	/** Constructs new Point from given Vector2 */
	public Point(Vector2 vector){
		this.x = (int)vector.x;
		this.y = (int)vector.y;
	}
	
	
	/** Returns Point of the sum of this Point with given Point */
	public Point add(Point point){
		return new Point(x+point.getX(), y+point.getY());
	}
	
	/** Returns Point of the difference of this Point with given Point */
	public Point substract(Point point){
		return new Point(x-point.getX(), y-point.getY());
	}
	
	/** Returns the product of this Point with the given Point, rounded to Integers */
	public Point multiply(Point point){
		return new Point(x*point.getX(), y*point.getY());
	}
	
	/** Returns Point of this Point scaled by given value rounded to Integers */
	public Point scale(int factor){
		return this.multiply(new Point(factor, factor));
	}
	
	/** Returns whether this Point is equal to the given Point */
	public boolean equals(Point point){
		return x==point.getX() && y==point.getY();
	}
	
	/** Returns Vector2 equivalent to this Point */
	public Vector2 getVector2(){
		return new Vector2(x, y);
	}
	
	/** Returns an int array of the form [x, y] */
	public int[] toArray(){
		return new int[]{x, y};
	}
	
	/** Returns a String of the Point */
	public String toString(){
		StringBuffer buffer = new StringBuffer();
		buffer.append('[').append(x).append('|').append(y).append(']');
		return buffer.toString();
	}
	
}
