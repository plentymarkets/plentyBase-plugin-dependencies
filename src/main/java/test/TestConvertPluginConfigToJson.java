package test;

import pluginConfig.data.PluginConfig;
import pluginConfig.helper.PluginConfigJsonHelper;
import java.util.HashMap;

public class TestConvertPluginConfigToJson
{
	public static void main(String[] arguments){
		HashMap<String, String> map = new HashMap<>();
		map.put("test", "test1");
		PluginConfig pluginConfig = new PluginConfig(map);
		String pluginConfigAsJson = PluginConfigJsonHelper.getPluginConfigAsJson(pluginConfig);
		System.out.println(pluginConfigAsJson);
	}
}
