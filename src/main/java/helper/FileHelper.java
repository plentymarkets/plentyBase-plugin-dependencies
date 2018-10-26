package helper;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileHelper
{

	public static boolean createFileIfNotExists(String filePath){
		try{
			File yourFile = new File(filePath);
		    boolean successfullyCreatedFile = yourFile.createNewFile();
		    return successfullyCreatedFile;
		}catch (Exception e){
			e.printStackTrace();
		}
		return false;
	}

	public static boolean doesFileExist(String filePath)
	{
		try{
			Path path = Paths.get(filePath);
			boolean fileExists = Files.exists(path);
			if(fileExists){
				return true;
			}
		}catch (Exception e){
			e.printStackTrace();
		}
		return false;
	}

	public static File getFile(String filePath)
	{
		try
		{
			return new File(filePath);
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		return null;
	}
}
