package interfaces;

public class PluginInformation
{
    private final String id;
    private final String name;
    private final String path;
    private final String version;

    public PluginInformation(String id, String name, String path, String version)
    {
        this.id = id;
        this.name = name;
        this.path = path;
        this.version = version;
    }

    public String getId()
    {
        return id;
    }

    public String getName()
    {
        return name;
    }

    public String getPath()
    {
        return path;
    }

    public String getVersion()
    {
        return version;
    }
}
