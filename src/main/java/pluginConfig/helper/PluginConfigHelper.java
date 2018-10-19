package pluginConfig.helper;

import pluginConfig.data.PluginConfig;

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
		Map<String,String> propertyMap = pluginConfig.getProperties();
		String propertyValue = propertyMap.get(propertyName);
		return propertyValue;
	}
}
