import config.data.PluginConfig;
import config.data.Property;
import config.helper.PluginConfigJsonHelper;

import java.util.ArrayList;
import java.util.List;

public class TestConvertPluginConfigToJson
{
	public static void main(String[] arguments){
		List<Property> properties = new ArrayList<>();
		Property property = new Property("test", "test1");
		properties.add(property);
		PluginConfig pluginConfig = new PluginConfig(properties);
		String pluginConfigAsJson = PluginConfigJsonHelper.getPluginConfigAsJson(pluginConfig);
		System.out.println(pluginConfigAsJson);
	}
}
