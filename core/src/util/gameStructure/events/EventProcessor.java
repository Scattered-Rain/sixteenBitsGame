package util.gameStructure.events;

/** Interface that quarantees that this object handles Events */
public interface EventProcessor {
	
	/** Processing the given Event */
	public void processEvent(Event event);
	
}
