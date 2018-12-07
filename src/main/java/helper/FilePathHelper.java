package helper;

import org.apache.commons.io.FilenameUtils;

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

	public static void main(String[] arguments){
		String filePath = "C:\\Hello\\AnotherFolder\\The File Name.PDF";
		String fileName = getFileNameFromFilePath(filePath);
		String fileDirectory = getFileDirectoryFromFilePath(filePath);
		String fileExtention = getFileExtentionFromFilePath(filePath);
		System.out.println(fileDirectory + " " + fileName + " " + fileExtention);
	}

	public static String getFileNameFromFilePath(String filePath)
	{
		if(filePath == null){
			return null;
		}
		String fileName = FilenameUtils.getBaseName(filePath);
		return fileName;
	}

	public static String getFileDirectoryFromFilePath(String filePath)
	{
		if(filePath == null){
			return null;
		}
		String fileDirectory = FilenameUtils.getFullPath(filePath);
		return fileDirectory;
	}

	public static String getFileExtentionFromFilePath(String filePath)
	{
		if(filePath == null){
			return null;
		}
		String fileExtention = FilenameUtils.getExtension(filePath);
		return fileExtention;
	}
}
