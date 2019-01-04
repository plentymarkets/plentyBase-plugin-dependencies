package pluginConfig.service;

import helper.FileReadingHelper;
import helper.FileStoringHelper;
import helper.JsonHelper;
import locations.services.PluginPathService;
import pluginConfig.data.PluginConfig;
import pluginConfig.helper.PluginConfigHelper;
import pluginConfig.helper.PluginConfigJsonHelper;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class PluginConfigService
{
	// gets a plugin config from the plugin config file
	public static PluginConfig getPluginConfig(String pluginId)
	{
		String pluginConfigFilePath = PluginPathService.getPluginConfigFilePath(pluginId);
		String pluginConfigJsonString = FileReadingHelper.getFileContentAsStringUtf8(pluginConfigFilePath);
        PluginConfig pluginConfig = PluginConfigJsonHelper.getPluginConfigFromJson(pluginConfigJsonString);
		return pluginConfig;
	}

	// gets a property value from a plugin config
	public static String getPluginConfigProperty(PluginConfig pluginConfig, String propertyName)
	{
		String propertyValue = PluginConfigHelper.getPluginConfigProperty(pluginConfig, propertyName);
		return propertyValue;
	}

	// gets a property value from the plugin config file
	public static String getPluginConfigProperty(String pluginId, String propertyName)
	{
		PluginConfig pluginConfig = getPluginConfig(pluginId);
		String propertyValue = getPluginConfigProperty(pluginConfig, propertyName);
		return propertyValue;
	}

	// gets a property value from a plugin config
	public static String getPluginConfigProperty(String pluginId, String propertyName, String fallbackValue)
	{
		String propertyValue = getPluginConfigProperty(pluginId, propertyName);
		if(propertyValue == null){
			return fallbackValue;
		}
		return propertyValue;
	}

	// stores plugin config to plugin config file
	public static boolean storePluginConfig(String pluginId, String pluginConfig)
	{
		String pluginConfigFilePath = PluginPathService.getPluginConfigFilePath(pluginId);
		boolean successfullyStoredPluginConfig = FileStoringHelper.storeStringToFile(pluginConfigFilePath, pluginConfig);
		return successfullyStoredPluginConfig;
	}

	// stores a plugin config to plugin config file
	public static boolean storePluginConfig(String pluginId, PluginConfig pluginConfig)
	{
		String pluginConfigJson = JsonHelper.getObjectAsJson(pluginConfig);
		return storePluginConfig(pluginId, pluginConfigJson);
	}

	// sets plugin config property in plugin config file, if no plugin config file exists one will be created
	public static boolean setPluginConfigProperty(String pluginId, String propertyName, String propertyValue)
	{
		if(propertyName == null){
			return false;
		}
		PluginConfig pluginConfig = getPluginConfig(pluginId);
		if(pluginConfig == null){
			LinkedHashMap<String,String> emptyMap = new LinkedHashMap<>();
			pluginConfig = new PluginConfig(emptyMap);
		}
		Map<String, String> propertyMap = pluginConfig.getProperties();
		propertyMap.put(propertyName, propertyValue);
		storePluginConfig(pluginId, pluginConfig);
		return true;
	}

	// deletes a plugin config
	public static boolean deletePluginConfig(String pluginId)
	{
		String pluginConfigFilePath = PluginPathService.getPluginConfigFilePath(pluginId);
		boolean successfullyDeletedFile = FileStoringHelper.deleteFile(pluginConfigFilePath);
		return successfullyDeletedFile;
	}
}
