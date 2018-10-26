package helper;

import org.apache.pdfbox.io.IOUtils;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.InputStream;
import java.nio.file.Files;

/**
 * @author jeromeklemm
 */
public class ByteArrayHelper
{

	public static byte[] getFileAsByteArray(File file)
	{
		try
		{
			return Files.readAllBytes(file.toPath());
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		return null;
	}

	public static byte[] getBase64StringAsByteArray(String base64String)
	{
		byte[] byteArray = new byte[0];
		try{
			com.sun.org.apache.xml.internal.security.Init.init();
			byteArray = com.sun.org.apache.xml.internal.security.utils.Base64.decode(base64String);
		}catch (Exception e){
			e.printStackTrace();
		}
		return byteArray;
	}

	public static byte[] getInputStreamAsByteArray(InputStream inputStream)
	{
		try
		{
			byte[] byteArray = IOUtils.toByteArray(inputStream);
			return byteArray;
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		return null;
	}

	public static byte[] getByteArrayOutputStreamAsByteArray(ByteArrayOutputStream byteArrayOutputStream)
	{
		try
		{
			byte[] byteArray = byteArrayOutputStream.toByteArray();
			return byteArray;
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		return null;
	}
}
