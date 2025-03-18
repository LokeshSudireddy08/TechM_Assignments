package examples;

import org.springframework.beans.factory.*;
import org.springframework.beans.factory.xml.*;
import org.springframework.core.io.*;
public class ItemBeanRunner {
	public static void main(String[] args)
	{
		// inclusion of XML File
		Resource res = new ClassPathResource("config.xml");
		@SuppressWarnings("depreacation")
		BeanFactory factory = new XmlBeanFactory(res);
		
		// inject the values via XML File 
		
		ItemsBean ibn = (ItemsBean)factory.getBean("itemBean");
		ibn.displayDetails();
	}
}
