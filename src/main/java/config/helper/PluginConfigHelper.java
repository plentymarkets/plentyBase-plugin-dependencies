package config.helper;

import com.google.gson.Gson;
import com.google.gson.internal.LinkedTreeMap;
import config.data.PluginConfig;
import config.data.Property;

import java.util.ArrayList;
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

	public static boolean validatePluginConfig(String pluginConfigJSON)
	{
		Map map = new Gson().fromJson(pluginConfigJSON, Map.class);

		List<String> tmpKeyList = new ArrayList<>();
		if (map.containsKey("properties"))
		{
			ArrayList<LinkedTreeMap> properties = (ArrayList<LinkedTreeMap>)map.get("properties");

			for (LinkedTreeMap t : properties)
			{
				if (t.containsKey("key"))
				{
					String key = (String)t.get("key");
					if (tmpKeyList.contains(key))
					{
						return false;
					}
					tmpKeyList.add((String)t.get("key"));
				}
			}
		}

		return true;
	}
}
