package test;

import helper.JsonHelper;
import pluginConfig.data.PluginConfig;
import pluginConfig.service.PluginConfigService;

public class TestGetPluginConfig
{
	public static void main(String[] arguments){
		PluginConfig pluginConfig = PluginConfigService.getPluginConfig("plentyBaseOfflineArticleSearch");
		String pluginConfigJson = JsonHelper.getObjectAsJson(pluginConfig);
		System.out.println(pluginConfigJson);
	}
}
