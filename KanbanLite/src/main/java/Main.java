

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import config.Configuration;
import config.DBconfig;
import config.View;

public class Main {

   private static ApplicationContext context;
   
   public static void main(String[] args) {
      
      
      context = new ClassPathXmlApplicationContext("Beans.xml");
      String configSource = (String) context.getBean("configSource");
      
      Configuration config = new Configuration();
      List<DBconfig> databases = new ArrayList<DBconfig>();
      DBconfig conf = new DBconfig();
      conf.setName("Database 1");
      conf.setURI("db1.sqlite");
      List<View> views = new ArrayList<View>();
      View view = new View();
      
      view.setColumns(new String[] {"columna 11", "columna 12", "tag 13"});
      view.setTags(new String[] {"tag 11", "tag 12", "tag 13"});
      view.setTopics(new String[] {"topic 11", "topic 12", "topic 13"});
      
      views.add(view);
      
      view = new View();
      
      view.setColumns(new String[] {"columna 21", "columna 22", "tag 23"});
      view.setTags(new String[] {"tag 21", "tag 22", "tag 23"});
      view.setTopics(new String[] {"topic 21", "topic 22", "topic 23"});
      
      views.add(view);
      conf.setViews(views);
      
      
      databases.add(conf);

      config.setDatabases(databases);
      config.setConfiguration(configSource);
      config = Configuration.getConfiguration(configSource);
      
   }

}
