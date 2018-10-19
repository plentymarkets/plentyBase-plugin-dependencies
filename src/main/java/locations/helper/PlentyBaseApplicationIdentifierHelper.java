package locations.helper;

import org.apache.commons.lang3.SystemUtils;

public class PlentyBaseApplicationIdentifierHelper
{
	public static String APP_IDENTIFIER_MACOS = "eu.plentymarkets.plentybase";
	public static String APP_IDENTIFIER = "plentybase";
	public static String APP_IDENTIFIER_LINUX = ".plentybase"; // Hidden directory

	/**
	 * Linux uses dot + application name as hidden config directory in home directory
	 *
	 * @return String identifier for application
	 */
	public static String getApplicationIdentifier()
	{
		if (SystemUtils.IS_OS_LINUX)
		{
			return APP_IDENTIFIER_LINUX;
		}
		else if (SystemUtils.IS_OS_MAC || SystemUtils.IS_OS_MAC_OSX)
		{
			return APP_IDENTIFIER_MACOS;
		}
		else
		{
			return APP_IDENTIFIER;
		}
	}
}
