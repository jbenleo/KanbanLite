
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import config.Configuration;
public class Main {

   private static ApplicationContext context;
   
   public static void main(String[] args) {
      
      
      context = new ClassPathXmlApplicationContext("Beans.xml");
      String configSource = (String) context.getBean("configSource");
      
      Configuration config = new Configuration();
      config.setConfiguration(configSource);
      config = Configuration.getConfiguration(configSource);
      
   }

}
