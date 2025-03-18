package examples;

import org.springframework.beans.factory.*;
import org.springframework.beans.factory.xml.*;
import org.springframework.core.io.*;
public class DisplayDetails {
	public static void main(String arg[]) {
		Resource r=new ClassPathResource("config.xml");
		@SuppressWarnings("deprication")
		BeanFactory f=new XmlBeanFactory(r);
		Shopping i=(Shopping) f.getBean("shopBean");
		i.display();
	}
}