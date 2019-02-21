package config.helper;

import helper.StringHelper;
import config.data.Property;

import java.util.List;

public class PropertyHelper
{
	public static String getPropertyValueForPropertyName(List<Property> properties, String searchedPropertyName)
	{
		if(properties == null){
			return null;
		}
		for(Property property : properties){
			String propertyName = getPropertyName(property);
			boolean propertyIsSearchedProperty = StringHelper.areStringsEqualAndNotNull(propertyName, searchedPropertyName);
			if(propertyIsSearchedProperty){
				String propertyValue = getPropertyValue(property);
				return propertyValue;
			}
		}
		return null;
	}

	private static String getPropertyName(Property property)
	{
		if(property == null){
			return null;
		}
		String propertyName = property.getKey();
		return propertyName;
	}

	private static String getPropertyValue(Property property)
	{
		if(property == null){
			return null;
		}
		String propertyValue = property.getValue();
		return propertyValue;
	}
}
