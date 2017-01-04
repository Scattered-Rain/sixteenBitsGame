package util;

/** Collection of generic utility methods */
public class UtilMethods{
	
	/** Returns whether the two given float values are equal */
	public static boolean floatEquals(float a, float b){
		return Math.abs(a-b)<Constants.EPSILON;
	}
	
}
