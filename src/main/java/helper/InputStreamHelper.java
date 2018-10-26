package helper;

import org.apache.pdfbox.io.IOUtils;

import java.io.*;
import java.nio.charset.StandardCharsets;

/**
 * @author jeromeklemm
 */
public class InputStreamHelper
{
	public static InputStream getByteArrayAsInputStream(byte[] byteArray)
	{
		InputStream inputStream = new ByteArrayInputStream(byteArray);
		return inputStream;
	}

	public static InputStream getBase64StringAsInputStream(String base64String)
	{
		byte[] byteArray = ByteArrayHelper.getBase64StringAsByteArray(base64String);
		InputStream inputStream = getByteArrayAsInputStream(byteArray);
		return inputStream;
	}

	public static void printInputStream(InputStream inputStream){
		String theString = getStringFromInputStream(inputStream);
		System.out.println("theString:" + theString);
	}

	public static String getStringFromInputStream(InputStream inputStream) {
		BufferedReader bufferedReader = null;
		StringBuilder stringBuilder = new StringBuilder();
		String line;
		try {
			if(inputStream == null){
				return null;
			}
			InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
			bufferedReader = new BufferedReader(inputStreamReader);
			while ((line = bufferedReader.readLine()) != null) {
				stringBuilder.append(line);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (bufferedReader != null) {
				try {
					bufferedReader.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		return stringBuilder.toString();
	}

	public static InputStream getInputStreamFromFile(File file)
	{
		InputStream inputStream = null;
		try
		{
			inputStream = new FileInputStream(file);
		}
		catch (FileNotFoundException e)
		{
			e.printStackTrace();
		}
		return inputStream;
	}

	public static byte[] getByteArrayFromInputStream(InputStream fileContentAsInputStream)
	{
		byte[] bytes = new byte[0];
		try
		{
			bytes = IOUtils.toByteArray(fileContentAsInputStream);
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		return bytes;
	}

	public static InputStream getInputStreamFromString(String string)
	{
		if(string == null){
			return null;
		}

		byte[] bytes = getByteArrayFromString(string);
		InputStream stream = new ByteArrayInputStream(bytes);
		return stream;
	}

	private static byte[] getByteArrayFromString(String string)
	{
		byte[] bytes = new byte[0];
		try
		{
			bytes = string.getBytes(StandardCharsets.UTF_8.name());
		}
		catch (UnsupportedEncodingException e)
		{
			e.printStackTrace();
		}
		return bytes;
	}

	public static InputStream getInputStreamFromByteArray(byte[] bytesArray)
	{
		if(bytesArray == null){
			return null;
		}
		InputStream inputStream = new ByteArrayInputStream(bytesArray);
		return inputStream;
	}

	public static InputStream getBase64DecodedInputStream(InputStream content)
	{
		String base64EncodedString = InputStreamHelper.getStringFromInputStream(content);
		byte[] base64DecodedBytesArray = Base64Helper.getByteArrayFromBase64String(base64EncodedString);
		content = InputStreamHelper.getInputStreamFromByteArray(base64DecodedBytesArray);
		return content;
	}

	public static InputStream getInputStreamFromFilePath(String filePath)
	{
		File file = FileHelper.getFile(filePath);
		InputStream inputStream = getInputStreamFromFile(file);
		return inputStream;
	}
}
