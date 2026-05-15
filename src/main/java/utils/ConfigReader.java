package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

    private static Properties prop = new Properties();

    static {
        try {
            FileInputStream fis = new FileInputStream(
                    "src/main/resources/config.properties"
            );
            prop.load(fis);

        } catch (IOException e) {
            throw new RuntimeException("Failed to load config file", e);
        }
    }

    public static String getProperty(String key) {
        return prop.getProperty(key);
    }

    public static String getBrowser() {
        return getProperty("browser");
    }

    public static String getUrl(String env) {

        if (env.equalsIgnoreCase("qa")) {
            return getProperty("qa.url");
        } else if (env.equalsIgnoreCase("uat")) {
            return getProperty("uat.url");
        } else {
            throw new RuntimeException("Invalid env: " + env);
        }
    }
}