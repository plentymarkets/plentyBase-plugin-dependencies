package interfaces;

import java.util.Map;

/**
 * @author deubel
 */
public interface BasePlugin
{
	String getPluginIdentifier();

	void startupPlugin();
	
	Map<String, BaseEventListener> getEventListeners();
}
