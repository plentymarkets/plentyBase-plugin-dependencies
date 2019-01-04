package helper;

public class StringHelper
{
	public static boolean areStringsEqualAndNotNull(String firstString, String secondString)
	{
		if(firstString == null || secondString == null){
			return false;
		}
		if(firstString.equals(secondString)){
			return true;
		}
		return false;
	}
}
