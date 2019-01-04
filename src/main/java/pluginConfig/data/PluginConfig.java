package pluginConfig.data;

import java.util.LinkedHashMap;

public class PluginConfig
{
	LinkedHashMap<String,String> properties;

	public PluginConfig(LinkedHashMap<String, String> properties)
	{
		this.properties = properties;
	}

	public LinkedHashMap<String, String> getProperties()
	{
		return properties;
	}

	public void setProperties(LinkedHashMap<String, String> properties)
	{
		this.properties = properties;
	}
}
