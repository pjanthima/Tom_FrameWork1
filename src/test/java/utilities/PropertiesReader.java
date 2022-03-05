package utilities;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertiesReader {
	private static Properties configFile;

	static {

		try {
			String filePath = Constants.CONFIGURATION_FILEPATH;
			FileInputStream input = new FileInputStream(filePath);
			configFile = new Properties();
			configFile.load(input);
			input.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static String getProperty(String keyName) {
		return configFile.getProperty(keyName);
	}
}
