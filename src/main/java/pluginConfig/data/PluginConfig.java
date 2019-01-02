package pluginConfig.data;

import java.util.Map;

public class PluginConfig
{
	Map<String,String> properties;
	Boolean editable;

	public PluginConfig(Map<String, String> properties, Boolean editable)
	{
		this.properties = properties;
		this.editable = editable;
	}

	public Map<String, String> getProperties()
	{
		return properties;
	}

	public void setProperties(Map<String, String> properties)
	{
		this.properties = properties;
	}

	public Boolean getEditable()
	{
		return editable;
	}

	public void setEditable(Boolean editable)
	{
		this.editable = editable;
	}
}
