import config.service.PluginConfigService;

public class TestGetPluginConfigProperty
{
	public static void main(String[] arguments){
		String propertyValue = PluginConfigService.getPluginConfigProperty("plentyBaseOfflineArticleSearch", "test", "fallback");
		System.out.println("propertyValue:" + propertyValue);
	}
}
