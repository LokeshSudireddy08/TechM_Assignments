package examples;

import org.springframework.beans.factory.*;
import org.springframework.beans.factory.xml.*;
import org.springframework.core.io.*;
public class InventoryBeanRunner {
	public static void main(String[] args)
	{
		// inclusion of XML File 
		Resource res = new ClassPathResource("config.xml");
		@SuppressWarnings("deprecation")
		BeanFactory factory = new XmlBeanFactory(res);
		
		// inject the values via xml file 
		
		InventoryBean ibn = (InventoryBean)factory.getBean("iBean");
		ibn.displayValues();
	}
}
