package helper;

import com.oracle.tools.packager.Log;

import java.io.File;

/**
 * @author jeromeklemm
 */
public class DirectoryHelper
{
	public static void createDirectoryIfNotExists(String directory)
	{
		File logFile = new File(directory);

		if (!logFile.exists())
		{
			if (logFile.mkdirs())
			{
				Log.info("Created directory: " + logFile.getAbsolutePath());
			}
			else
			{
				Log.debug("Can't create directory: " + directory);
			}
		}
		else
		{
			if (!logFile.canWrite())
			{
				Log.debug("Target directory is not writable: " + directory);
			}
		}
	}
}
