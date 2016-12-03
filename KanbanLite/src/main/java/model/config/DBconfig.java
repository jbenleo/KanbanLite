package model.config;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "database")
public class DBconfig {
   
   private String name;
   private String URI;
   private List<View> views;
   
   @XmlElement
   public String getName() {
      return name;
   }
   
   public void setName(String name) {
      this.name = name;
   }
   @XmlElement
   public String getURI() {
      return URI;
   }
   
   public void setURI(String uRI) {
      URI = uRI;
   }
   @XmlElementWrapper
   @XmlElement (name = "view")
   public List<View> getViews() {
      return views;
   }
   
   public void setViews(List<View> views) {
      this.views = views;
   }
   
   
   
}