package helper;

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
				System.out.println("Created directory: " + logFile.getAbsolutePath());
			}
			else
			{
				System.out.println("Can't create directory: " + directory);
			}
		}
		else
		{
			if (!logFile.canWrite())
			{
				System.out.println("Target directory is not writable: " + directory);
			}
		}
	}
}
