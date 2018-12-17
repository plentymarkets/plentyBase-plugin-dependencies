package helper;

import java.io.File;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * @author jeromeklemm
 */
public class FileStoringHelper
{
	public static boolean storeBase64StringToFile(String content, String fileDirectory, String fileName, String fileExtension)
	{
		if (content == null || fileDirectory == null || fileName == null || fileExtension == null)
		{
			return false;
		}
		byte[] contentAsBytes = Base64Helper.getByteArrayFromBase64String(content);
		return storeByteArrayToFile(fileDirectory, fileName, fileExtension, contentAsBytes);
	}

	public static boolean storeStringToFile(String fileDirectory, String fileName, String fileExtention, String fileContent)
	{
		byte[] contentAsBytes = fileContent.getBytes();
		return storeByteArrayToFile(fileDirectory, fileName, fileExtention, contentAsBytes);
	}

	public static boolean storeInputStreamToFile(String fileDirectory,
												 String fileName,
												 String fileExtension,
												 InputStream fileContentAsInputStream)
	{
		byte[] contentAsBytes = InputStreamHelper.getByteArrayFromInputStream(fileContentAsInputStream);
		return storeByteArrayToFile(fileDirectory, fileName, fileExtension, contentAsBytes);
	}

	public static boolean storeStringToFile(String filePath, String fileContent)
	{
		String fileDirectory = FilePathHelper.getFileDirectoryFromFilePath(filePath);
		String fileName = FilePathHelper.getFileNameFromFilePath(filePath);
		String fileExtention = FilePathHelper.getFileExtentionFromFilePath(filePath);
		return storeStringToFile(fileDirectory, fileName, fileExtention, fileContent);
	}

	public static boolean storeByteArrayToFile(String fileDirectory, String fileName, String fileExtension, byte[] contentAsBytes)
	{
		//add file separator if it is missing
		if (fileDirectory != null && !fileDirectory.trim().isEmpty() && !fileDirectory.endsWith(File.separator))
		{
			fileDirectory += File.separator;
		}
		DirectoryHelper.createDirectoryIfNotExists(fileDirectory);
		String filePath = FilePathHelper.getFilePath(fileDirectory, fileName, fileExtension);
		return storeByteArrayToFile(filePath, contentAsBytes);
	}

	public static boolean deleteFile(String filePath)
	{
		String fileDirectory = FilePathHelper.getFileDirectoryFromFilePath(filePath);
		String fileName = FilePathHelper.getFileNameFromFilePath(filePath);
		String fileExtention = FilePathHelper.getFileExtentionFromFilePath(filePath);
		return deleteFile(fileDirectory, fileName, fileExtention);
	}

	public static boolean deleteFile(String fileDirectory, String fileName, String fileExtension)
	{
		String filePath = FilePathHelper.getFilePath(fileDirectory, fileName, fileExtension);
		Path path = Paths.get(filePath);
		try
		{
			if (path.toFile().exists())
			{
				Files.delete(path);
			}
			return true;
		}
		catch (Exception e)
		{
			return false;
		}
	}

	private static boolean storeByteArrayToFile(String filePath, byte[] contentAsBytes)
	{
		Path path = Paths.get(filePath);
		try
		{
			Files.write(path, contentAsBytes);
			return true;
		}
		catch (Exception e)
		{
			return false;
		}
	}
}
