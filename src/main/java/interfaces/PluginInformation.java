package interfaces;

public class PluginInformation
{
    private final String name;
    private final String version;

    public PluginInformation(String name, String version)
    {
        this.name = name;
        this.version = version;
    }

    public String getName()
    {
        return name;
    }

    public String getVersion()
    {
        return version;
    }
}
