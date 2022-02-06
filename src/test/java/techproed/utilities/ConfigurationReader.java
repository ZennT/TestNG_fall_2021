package techproed.utilities;

import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {

//    This class will ONLY be used for getting the data from
//    configuration.properties file
//    java doesn't let us reach config class directly, there is hierarchy, so we need that class

    private static Properties properties;

    static {
//        path of the config file
        String path = "configuration.properties";
        try {
//            opening the file
            FileInputStream file = new FileInputStream(path);
//            loading the file
            properties = new Properties();
            properties.load(file);
//            closing the file
            file.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //    This method accepts the key and returns the value
    public static String getProperty(String key) {
        return properties.getProperty(key);
    }
//    test
//    @Test
//    public void test1(){
//        System.out.println(getProperty("google_url"));
//        System.out.println(getProperty("test_environment"));
//        System.out.println(getProperty("url"));
//}

    }


