package utils.configuration.rules;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * The type Properties reader.
 */
public class PropertiesReader {

    /**
     * Read properties properties.
     *
     * @param name the name
     * @return the properties
     */
    @Deprecated
    public static Properties readProperties(String name) {
        try (InputStream stream = Thread.currentThread().getContextClassLoader().getResourceAsStream(name)) {
            Properties properties = new Properties();
            properties.load(stream);
            return properties;
        } catch (IOException e) {
            return null;
        }
    }

    /**
     * Read from the file string.
     *
     * @param path the path
     * @param data the data
     * @return the string
     * @throws IOException the io exception
     */
    public static String readFromTheFile(String path, String data) throws IOException {
        Properties obj = new Properties();
        FileInputStream file = new FileInputStream(path);
        obj.load(file);
        return obj.getProperty(data);
    }
}
