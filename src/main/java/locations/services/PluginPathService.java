package locations.services;

import locations.helper.CacheDirectoryHelper;
import locations.helper.PlentyBaseApplicationIdentifierHelper;
import java.io.File;

public class PluginPathService
{
	private static final String CONFIG_FILE_NAME = "config.json";
	private static final String PLUGIN_DATA_FOLDER_PATH = "Plugins" + File.separator + "data";

	/**
	 * Get path of plugin config file
	 *
	 * @return String
	 */
	public static String getPluginConfigFilePath(String pluginId)
	{
		String applicationFolderPath = getPluginDataFolderPath(pluginId);
		String pluginConfigFilePath = applicationFolderPath + File.separator + CONFIG_FILE_NAME;
		return pluginConfigFilePath;
	}

	/**
	 * Get path of plugin data folder
	 *
	 * @return String
	 */
	public static String getPluginDataFolderPath(String pluginId)
	{
		String applicationFolderPath = getPlentyBaseApplicationFolderPath();
		String pluginDataFolderPath = applicationFolderPath + File.separator + PLUGIN_DATA_FOLDER_PATH + File.separator + pluginId;
		return pluginDataFolderPath;
	}

	/**
	 * Get path of plentyBase application folder
	 *
	 * @return String
	 */
	private static String getPlentyBaseApplicationFolderPath()
	{
		String cachesDirectory = CacheDirectoryHelper.getCachesDirectory();
		String applicationIdentifier = PlentyBaseApplicationIdentifierHelper.getApplicationIdentifier();
		String applicationFolderPath = cachesDirectory + File.separator + applicationIdentifier;
		return applicationFolderPath;
	}
}
