package config.helper;

import com.google.gson.Gson;
import helper.JsonHelper;
import config.data.PluginConfig;

public class PluginConfigJsonHelper
{
	public static PluginConfig getPluginConfigFromJson(String pluginConfigAsJson){
		Gson gson = new Gson();
		try{
		PluginConfig pluginConfig = gson.fromJson(pluginConfigAsJson, PluginConfig.class);
			return pluginConfig;
		}catch (Exception e){
			e.printStackTrace();
		}
		return null;
	}

	public static String getPluginConfigAsJson(PluginConfig pluginConfig){
		String pluginConfigAsJson = JsonHelper.getObjectAsJson(pluginConfig);
		return pluginConfigAsJson;
	}
}
