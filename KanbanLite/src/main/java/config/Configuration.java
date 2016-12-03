package config;

import java.io.File;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
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
   
   public static Configuration getConfiguration(String file) {

      JAXBContext jaxbContext;
      Configuration config = null;
      try {
         jaxbContext = JAXBContext.newInstance(Configuration.class);
         Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
         config = (Configuration) jaxbUnmarshaller.unmarshal(new File(file));
      } catch (JAXBException e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      } catch (Exception e){
         System.out.println("No se encuentra el fichero");
      }
      return config;
   }
   
   public void setConfiguration(String file){
      try {

         JAXBContext jaxbContext = JAXBContext.newInstance(Configuration.class);
         Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

         // output pretty printed
         jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

         jaxbMarshaller.marshal(this, new File(file));
         jaxbMarshaller.marshal(this, System.out);

      } catch (JAXBException e) {
         e.printStackTrace();
      }
   }
   
   @XmlElementWrapper
   @XmlElement (name = "database", required = true)
   public List<DBconfig> getDatabases() {
      return databases;
   }
   
   
   public void setDatabases(List<DBconfig> databases) {
      this.databases = databases;
   }   
}
