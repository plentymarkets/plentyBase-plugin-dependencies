package test;

import helper.JsonHelper;
import pluginConfig.data.PluginConfig;
import pluginConfig.service.PluginConfigService;

import java.util.HashMap;
import java.util.Map;

public class TestStorePluginConfig
{
	public static void main(String[] arguments){
		Map<String, String> map = new HashMap<>();
		map.put("test2","test2");
		PluginConfig pluginConfigForStoring = new PluginConfig(map);

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
