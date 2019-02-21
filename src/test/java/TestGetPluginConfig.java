import helper.JsonHelper;
import config.data.PluginConfig;
import config.service.PluginConfigService;

public class TestGetPluginConfig
{
	public static void main(String[] arguments){
		PluginConfig pluginConfig = PluginConfigService.getPluginConfig("plentyBaseOfflineArticleSearch");
		String pluginConfigJson = JsonHelper.getObjectAsJson(pluginConfig);
		System.out.println(pluginConfigJson);
	}
}
