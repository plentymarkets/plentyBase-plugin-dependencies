package helper;

/**
 * @author jeromeklemm
 */
public class Base64Helper
{
	public static byte[] getByteArrayFromBase64String(String content)
	{
		byte[] byteArray = null;
		try{
			com.sun.org.apache.xml.internal.security.Init.init();
			byteArray = com.sun.org.apache.xml.internal.security.utils.Base64.decode(content);
		}catch (Exception e){
			e.printStackTrace();
		}
        return byteArray;
	}

}
