package interfaces;

public interface ApplicationContext
{
    PluginInformation getPluginInformation();
    <T> T make(Class<T> clazz);
}
