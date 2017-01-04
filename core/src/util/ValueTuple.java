package util;

/** Tuple of a Float Value with a generic Object */
public class ValueTuple<Generic> extends Tuple<Float, Generic> implements Comparable<ValueTuple<Generic>>{
	
	/** Construct new Value Tuple */
	public ValueTuple(Float value, Generic generic) {
		super(value, generic);
	}
	
	/** Compares Value of this Tuple with Value of given Tuple, smaller=-1, equal=0, bigger=1 */
	@Override public int compareTo(ValueTuple<Generic> other){
		float thisA = super.getA();
		float otherA = other.getA();
		if(UtilMethods.floatEquals(thisA, otherA)){
			return 0;
		}
		else{
			return (thisA>otherA)?1:-1;
		}
	}
	
}
