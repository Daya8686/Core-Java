package CollectionsInJava;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class JavaProperties {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Properties is a collection where it will take key and value as strings
		//By using this Properties we can save the values as keys and values and this will also store data in the form of txt and xml
		
		
		Properties p =new Properties();
		p.put("Brand", "Dell");
		p.put("Processor", "i7");
		p.put("Model", "Insprone 5501");
		p.put("MFY", "2021");
		p.put("Storage","512GB");
		p.put("RAM", "12GB");
		try {
			p.store(new FileOutputStream("C:\\Java\\propertyFromCollection.txt"), "Laptop Details");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//We can also store this in to the XML and as well as we can retrieve the information from the txt and XML files
		//I have created a txt file as same as property file lets take it and print it on the console
		Properties p1=new Properties();
			try {
				p1.load(new FileInputStream("C:\\Java\\FromTXT_to_property.txt"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		System.out.println(p1.getProperty("Brand"));
		
		
		
		//Now in the form of XML
		
		try {
			p.storeToXML(new FileOutputStream("C:\\Java\\propertyFromCollection.xml"), "Laptop Details");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			p.load(new FileInputStream("C:\\Java\\propertyFromCollection.xml"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	System.out.println(p.getProperty("Brand"));
		
	}

}
