package interfaces;

import event.EventBean;

import java.util.EventListener;

/**
 * @author deubel
 */
public interface BaseEventListener extends EventListener
{
	void fireEvent(EventBean eventBean);
}
