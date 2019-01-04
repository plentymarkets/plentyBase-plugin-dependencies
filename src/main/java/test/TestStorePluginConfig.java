package test;

import helper.JsonHelper;
import pluginConfig.data.PluginConfig;
import pluginConfig.data.Property;
import pluginConfig.service.PluginConfigService;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestStorePluginConfig
{
	public static void main(String[] arguments){
		List<Property> properties = new ArrayList<>();
		Property property = new Property("key2","value2");
		properties.add(property);
		PluginConfig pluginConfigForStoring = new PluginConfig(properties);

		String pluginId = "plentyBaseOfflineArticleSearch";
		PluginConfig storedPluginConfig = PluginConfigService.getPluginConfig(pluginId);
		String storedPluginConfigJson = JsonHelper.getObjectAsJson(storedPluginConfig);
		System.out.println("storedPluginConfig:" + storedPluginConfigJson);

		boolean successfullyStoredPluginConfig = PluginConfigService.storePluginConfig(pluginId, pluginConfigForStoring);

		// print out new stored plugin config
		PluginConfig newStoredPluginConfig = PluginConfigService.getPluginConfig(pluginId);
		String newStoredPluginConfigJson = JsonHelper.getObjectAsJson(newStoredPluginConfig);
		System.out.println("successfullyStoredPluginConfig:" + successfullyStoredPluginConfig);
		System.out.println("newStoredPluginConfig:" + newStoredPluginConfigJson);
	}
}
