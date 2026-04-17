package genericUtility;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
/**
 * This is an utility class which deals with properties file
 * @author Keerthana 
 * @version 26-03-20
 */
public class PropertiesUtility {
/**
 * This is a generic method to fetch the data from properties files
 * @param args
 * @throws IOException
 * @return
 */
	
		public String getDataFromProperties(String key) throws IOException 
		{
			FileInputStream fis = new FileInputStream(IPathUtility.propertiesPath);
			Properties prop = new Properties();
			prop.load(fis);
			String value = prop.getProperty(key);
			return value;
		}
		public void writDataToProperties(String key,String value,String comment) throws IOException {
			FileInputStream fis = new FileInputStream(IPathUtility.propertiesPath);
			Properties prop = new Properties();
			prop.load(fis);
			prop.setProperty(key, value);
			FileOutputStream fos = new FileOutputStream(IPathUtility.propertiesPath);
			prop.store(fos, comment);
		}
		
		
	}


