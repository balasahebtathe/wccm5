package keyDrivenFramework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Flib {

	public String readPropertyFile(String proppath,String key) throws IOException {
		
		  FileInputStream fis = new FileInputStream(proppath);
		  
		    Properties prop = new Properties();
		    
		    prop.load(fis);
		    String data = prop.getProperty(key);
		    
		    return data;

	}

}
