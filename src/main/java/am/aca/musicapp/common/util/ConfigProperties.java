package am.aca.musicapp.common.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/**
 * Created by Narek on 11.09.2016.
 */
public class ConfigProperties {
    private static ConfigProperties prop = null;
    private Properties property;

    private ConfigProperties() {
        String path = "src\\main\\resources\\config.properties";
        FileInputStream inStream;
        property = new Properties();
        try {
            inStream = new FileInputStream(path);
            property.load(inStream);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static ConfigProperties getInstance() {
        if (prop == null) {
            prop = new ConfigProperties();
        }
        return prop;
    }

    public String getMessage(String key) {
        return property.getProperty(key);
    }

}
