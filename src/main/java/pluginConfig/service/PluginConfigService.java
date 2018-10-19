package pluginConfig.service;

import helper.FileReadingHelper;
import locations.services.PluginPathService;
import pluginConfig.data.PluginConfig;
import pluginConfig.helper.PluginConfigHelper;
import pluginConfig.helper.PluginConfigJsonHelper;

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
}
