package test;

import pluginConfig.service.PluginConfigService;

public class TestGetPluginConfigProperty
{
	public static void main(String[] arguments){
		String propertyValue = PluginConfigService.getPluginConfigProperty("plentyBaseOfflineArticleSearch", "test");
		System.out.println("propertyValue:" + propertyValue);
	}
}
