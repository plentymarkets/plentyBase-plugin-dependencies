package config.data;

import java.util.List;

public class PluginConfig
{
	List<Property> properties;

	public PluginConfig(List<Property> properties)
	{
		this.properties = properties;
	}

	public List<Property> getProperties()
	{
		return properties;
	}

	public void setProperties(List<Property> properties)
	{
		this.properties = properties;
	}
}
