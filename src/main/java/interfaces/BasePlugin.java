package interfaces;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

/**
 * @author deubel
 */
public interface BasePlugin
{

	void startupPlugin();

	Map<String, BaseEventListener> getEventListeners();

	// servlet methods

	// get requests are calling this method
	String doGet(String route, HttpServletRequest request, HttpServletResponse response);
}
