package interfaces;

import java.util.Map;

/**
 * @author deubel
 */
public interface BasePlugin
{

	void startupPlugin();

	Map<String, BaseEventListener> getEventListeners();

	String doGet();
}
