package interfaces;

import java.util.EventListener;

/**
 * @author deubel
 */
public interface BaseEventListener extends EventListener
{
	void fireEvent(Object arg);
}
