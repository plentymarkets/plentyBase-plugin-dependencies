package event;

import javax.ws.rs.core.PathSegment;
import java.util.List;

/**
 * @author deubel
 */
public class EventBean
{
	private String identifier;
	private List<PathSegment> pathSegmentList;
	private String jsonData;

	public String getIdentifier()
	{
		return identifier;
	}

	public void setIdentifier(String identifier)
	{
		this.identifier = identifier;
	}

	public List<PathSegment> getPathSegmentList()
	{
		return pathSegmentList;
	}

	public void setPathSegmentList(List<PathSegment> pathSegmentList)
	{
		this.pathSegmentList = pathSegmentList;
	}

	public String getJsonData()
	{
		return jsonData;
	}

	public void setJsonData(String jsonData)
	{
		this.jsonData = jsonData;
	}
}
