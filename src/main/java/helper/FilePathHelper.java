package helper;

import java.io.File;

public class FilePathHelper
{
	public static String getFilePath(String fileDirectory, String fileName, String fileExtension)
	{
		if (!fileDirectory.endsWith(File.separator))
		{
			fileDirectory += File.separator;
		}
		return fileDirectory + fileName + "." + fileExtension;
	}
}
