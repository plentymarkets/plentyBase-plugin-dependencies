package pluginConfig.helper;

import pluginConfig.data.PluginConfig;
import pluginConfig.data.Property;

import java.util.List;
import java.util.Map;

public class PluginConfigHelper
{
	public static String getPluginConfigProperty(PluginConfig pluginConfig, String propertyName)
	{
		if(pluginConfig == null){
			return null;
		}
		if(propertyName == null){
			return null;
		}
		List<Property> properties = pluginConfig.getProperties();
		String propertyValue = PropertyHelper.getPropertyValueForPropertyName(properties, propertyName);
		return propertyValue;
	}
}
