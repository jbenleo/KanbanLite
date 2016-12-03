package controller;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import model.config.Configuration;

public class ConfigIO {
   
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
   
   public static void setConfiguration(Configuration config, String file){
      try {

         JAXBContext jaxbContext = JAXBContext.newInstance(Configuration.class);
         Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

         // output pretty printed
         jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

         jaxbMarshaller.marshal(config, new File(file));
         jaxbMarshaller.marshal(config, System.out);

      } catch (JAXBException e) {
         e.printStackTrace();
      }
   }
}
