package locations.helper;

import org.apache.commons.lang3.SystemUtils;
import java.io.File;

public class CacheDirectoryHelper
{
	public static String getCachesDirectory()
	{
		if (SystemUtils.IS_OS_MAC || SystemUtils.IS_OS_MAC_OSX)
		{
			return SystemUtils.USER_HOME + File.separator + "Library" + File.separator + "Caches";
		}
		else if (SystemUtils.IS_OS_LINUX)
		{
			return SystemUtils.USER_HOME;
		}
		else if (SystemUtils.IS_OS_WINDOWS)
		{
			return SystemUtils.USER_HOME + File.separator + "AppData" + File.separator + "Local" + File.separator + "plentymarkets";
		}
		else
		{
			return SystemUtils.JAVA_IO_TMPDIR;
		}
	}
}
