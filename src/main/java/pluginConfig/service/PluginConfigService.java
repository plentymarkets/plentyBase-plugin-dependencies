package pluginConfig.service;

import helper.FileReadingHelper;
import helper.FileStoringHelper;
import helper.JsonHelper;
import locations.services.PluginPathService;
import pluginConfig.data.PluginConfig;
import pluginConfig.helper.PluginConfigHelper;
import pluginConfig.helper.PluginConfigJsonHelper;

import java.util.HashMap;
import java.util.Map;

public class PluginConfigService
{
	public static PluginConfig getPluginConfig(String pluginId)
	{
		String pluginConfigFilePath = PluginPathService.getPluginConfigFilePath(pluginId);
		String pluginConfigJsonString = FileReadingHelper.getFileContentAsStringUtf8(pluginConfigFilePath);
        PluginConfig pluginConfig = PluginConfigJsonHelper.getPluginConfigFromJson(pluginConfigJsonString);
		return pluginConfig;
	}

	public static String getPluginConfigProperty(PluginConfig pluginConfig, String propertyName)
	{
		String propertyValue = PluginConfigHelper.getPluginConfigProperty(pluginConfig, propertyName);
		return propertyValue;
	}

	public static String getPluginConfigProperty(String pluginId, String propertyName)
	{
		PluginConfig pluginConfig = getPluginConfig(pluginId);
		String propertyValue = getPluginConfigProperty(pluginConfig, propertyName);
		return propertyValue;
	}

	public static boolean storePluginConfig(String pluginId, String pluginConfig)
	{
		String pluginConfigFilePath = PluginPathService.getPluginConfigFilePath(pluginId);
		boolean successfullyStoredPluginConfig = FileStoringHelper.storeStringToFile(pluginConfigFilePath, pluginConfig);
		return successfullyStoredPluginConfig;
	}

	public static boolean storePluginConfig(String pluginId, PluginConfig pluginConfig)
	{
		String pluginConfigJson = JsonHelper.getObjectAsJson(pluginConfig);
		return storePluginConfig(pluginId, pluginConfigJson);
	}

	public static boolean setPluginConfigProperty(String pluginId, String propertyName, String propertyValue)
	{
		if(propertyName == null){
			return false;
		}
		PluginConfig pluginConfig = getPluginConfig(pluginId);
		if(pluginConfig == null){
			Map<String,String> emptyMap = new HashMap<>();
			pluginConfig = new PluginConfig(emptyMap);
		}
		Map<String, String> propertyMap = pluginConfig.getProperties();
		propertyMap.put(propertyName, propertyValue);
		storePluginConfig(pluginId, pluginConfig);
		return true;
	}
}
