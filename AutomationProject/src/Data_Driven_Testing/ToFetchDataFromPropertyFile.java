package Data_Driven_Testing;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ToFetchDataFromPropertyFile 
{

	public static void main(String[] args) throws IOException 
	{
		//The actual representation of properties file is converted to java representation.
		FileInputStream fis=new FileInputStream("./TestData/PropertyData.properties");
		//create an object of properties class
		Properties property=new Properties();
		//we are load all the keys and value
		property.load(fis);
		//fetching the value using key
		String url=property.getProperty("url");
		String username=property.getProperty("username");
		String password=property.getProperty("password");
	
		
		System.out.println(url);
		System.out.println(username);
		System.out.println(password);	

	}

}
