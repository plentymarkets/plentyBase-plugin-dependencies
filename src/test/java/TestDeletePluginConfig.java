import config.service.PluginConfigService;

public class TestDeletePluginConfig
{
	public static void main(String[] arguments){
		String plentyBaseOfflineArticleSearch = "plentyBaseHelloworld";
		boolean successfullyDeletedPluginConfig = PluginConfigService.deletePluginConfig(plentyBaseOfflineArticleSearch);
		System.out.println("successfullyDeletedPluginConfig:" + successfullyDeletedPluginConfig);
	}
}
