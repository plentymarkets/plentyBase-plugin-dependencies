package interfaces;

import javax.servlet.http.HttpServlet;
import java.util.Map;

/**
 * @author deubel
 */
public interface BasePlugin
{

	// define everything which should happen at plugin startup here
	void startupPlugin();

	// define all event listeners that should be registered here
	Map<String, BaseEventListener> getEventListeners();

	// define all servlets that should be registered here
	Map<String, HttpServlet> getServlets();
}
