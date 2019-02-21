import helper.JsonHelper;
import config.data.PluginConfig;
import config.service.PluginConfigService;

public class TestSetPluginConfigProperty
{
	public static void main(String[] arguments){
		String pluginId = "plentyBaseOfflineArticleSearch";
		PluginConfig pluginConfig = PluginConfigService.getPluginConfig(pluginId);
		String pluginConfigJson = JsonHelper.getObjectAsJson(pluginConfig);
		System.out.println("pluginConfigJson:" + pluginConfigJson);
		boolean successfullySetPluginConfigProperty = PluginConfigService.setPluginConfigProperty(pluginId, "test4","test4");
		PluginConfig newPluginConfig = PluginConfigService.getPluginConfig(pluginId);
		String newPluginConfigJson = JsonHelper.getObjectAsJson(newPluginConfig);
		System.out.println("successfullySetPluginConfigProperty:" + successfullySetPluginConfigProperty);
		System.out.println("newPluginConfigJson:" + newPluginConfigJson);
	}
}
