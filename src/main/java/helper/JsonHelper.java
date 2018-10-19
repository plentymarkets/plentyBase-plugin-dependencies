package helper;

import com.google.gson.Gson;

public class JsonHelper
{
	public static String getObjectAsJson(Object object){
		Gson gson = new Gson();
		try{
			String objectAsJson = gson.toJson(object, Object.class);
			return objectAsJson;
		}catch (Exception e){
			e.printStackTrace();
		}
		return null;
	}
}
