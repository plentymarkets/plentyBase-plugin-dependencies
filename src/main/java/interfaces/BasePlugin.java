package interfaces;

import config.data.PluginConfig;

import javax.servlet.http.HttpServlet;
import java.util.Map;

/**
 * @author deubel
 */
public abstract class BasePlugin
{

    public void injectApplicationContext(ApplicationContext context)
    {
    }

    // define everything which should happen at plugin startup here
    public abstract void startupPlugin();

    // define all event listeners that should be registered here
    public Map<String, BaseEventListener> getEventListeners()
    {
        return null;
    }

    // define all servlets that should be registered here
    public Map<String, HttpServlet> getServlets()
    {
        return null;
    }

    // define all servlets that should be registered here
    public PluginConfig getDefaultPluginConfig()
    {
        return null;
    }
}
