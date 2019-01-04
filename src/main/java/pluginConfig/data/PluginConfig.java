package pluginConfig.data;

import java.util.Map;

public class PluginConfig
{
	Map<String,String> properties;

	public PluginConfig(Map<String, String> properties)
	{
		this.properties = properties;
	}

	public Map<String, String> getProperties()
	{
		return properties;
	}

	public void setProperties(Map<String, String> properties)
	{
		this.properties = properties;
	}
}
