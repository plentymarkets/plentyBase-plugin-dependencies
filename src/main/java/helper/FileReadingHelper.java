package helper;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileReadingHelper
{
	public static String getFileContentAsStringUtf8(String filePath)
	{
		try{
			Path path = Paths.get(filePath);
			boolean fileExists = Files.exists(path);
			if(!fileExists){
				return null;
			}
			byte[] bytes = Files.readAllBytes(path);
			String string = new String(bytes, "UTF-8");
			return string;
		}catch (Exception e){
			e.printStackTrace();
		}
		return null;
	}
}
