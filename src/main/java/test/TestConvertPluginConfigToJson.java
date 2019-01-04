package test;

import pluginConfig.data.PluginConfig;
import pluginConfig.helper.PluginConfigJsonHelper;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class TestConvertPluginConfigToJson
{
	public static void main(String[] arguments){
		LinkedHashMap<String, String> map = new LinkedHashMap<>();
		map.put("test", "test1");
		PluginConfig pluginConfig = new PluginConfig(map);
		String pluginConfigAsJson = PluginConfigJsonHelper.getPluginConfigAsJson(pluginConfig);
		System.out.println(pluginConfigAsJson);
	}
}
