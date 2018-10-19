package locations.services;

import locations.helper.CacheDirectoryHelper;
import locations.helper.PlentyBaseApplicationIdentifierHelper;
import java.io.File;

public class PluginPathService
{
	private static final String CONFIG_FILE_NAME = "config.json";
	private static final String PLUGIN_FOLDER_PATH = "Plugin Data";

	/**
	 * Get path of plentyBase application folder
	 *
	 * @return String
	 */
	public static String getPluginConfigFilePath(String pluginId)
	{
		String applicationFolderPath = getPluginFolderPath(pluginId);
		String pluginConfigFilePath = applicationFolderPath + File.separator + CONFIG_FILE_NAME;
		return pluginConfigFilePath;
	}

	/**
	 * Get path of plentyBase application folder
	 *
	 * @return String
	 */
	public static String getPluginFolderPath(String pluginId)
	{
		String applicationFolderPath = getPlentyBaseApplicationFolderPath();
		String pluginFolderPath = applicationFolderPath + File.separator + PLUGIN_FOLDER_PATH + File.separator + pluginId;
		return pluginFolderPath;
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
