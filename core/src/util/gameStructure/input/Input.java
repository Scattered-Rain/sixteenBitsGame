package util.gameStructure.input;

import util.Direction;

import com.badlogic.gdx.Input.Keys;

import lombok.AllArgsConstructor;
import lombok.Getter;

/** Enumeration of possible controller inputs */
@AllArgsConstructor public enum Input {
	
	UP(Keys.W),
	RIGHT(Keys.D),
	DOWN(Keys.S),
	LEFT(Keys.A),
	ACTION_A(Keys.J),
	ACTION_B(Keys.K),
	START(Keys.ESCAPE),
	SELECT(Keys.ENTER);
	
	/** The Key the input defaults to */
	@Getter int defaultKey;
	
	/** Returns the direction corresponding to the given input, if the input is not directional, returns null */
	public static Direction convertToDirection(Input input){
		final Direction[] dirs = Direction.values();
		final Input[] dirInputs = new Input[]{UP, RIGHT, DOWN, LEFT};
		for(int c=0; c<dirInputs.length; c++){
			if(dirInputs[c].equals(input)){
				return dirs[c];
			}
		}
		return null;
	}
	
}
