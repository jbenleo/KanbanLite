package model.config;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
/**
 * Configuration
 * This class follows the Singleton patter to use the same configuration for all the 
 * process 
 * */
@XmlRootElement
public class Configuration {

   private List<DBconfig> databases;
   
   @XmlElementWrapper
   @XmlElement (name = "database", required = true)
   public List<DBconfig> getDatabases() {
      return databases;
   }
   
   
   public void setDatabases(List<DBconfig> databases) {
      this.databases = databases;
   }   
}
