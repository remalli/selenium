package utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class property {
	
	static Properties prop;
	static FileInputStream fip;
	static FileOutputStream fop;
	static String  filename;
	
	public property(String filename) throws FileNotFoundException {
		this.filename=filename;
		prop =new Properties();
		fip =new FileInputStream(filename);
		fop =new FileOutputStream(filename);
	}
	
	public static void getproperty(String key) throws IOException {
		prop.load(fip);
		prop.getProperty(key);
		
	}
	
	public static void setproperty(String key,String value) throws IOException {
		fop =new FileOutputStream(filename);
		prop.setProperty(key, value);
		prop.store(fop, "stored a value in file");
	}

}
