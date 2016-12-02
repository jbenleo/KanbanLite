package config;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class DBconfig {
   private String name;
   private String URI;
   private List<View> views;
   
   public String getName() {
      return name;
   }
   @XmlElement
   public void setName(String name) {
      this.name = name;
   }
   public String getURI() {
      return URI;
   }
   @XmlElement
   public void setURI(String uRI) {
      URI = uRI;
   }
   public List<View> getViews() {
      return views;
   }
   @XmlElement
   public void setViews(List<View> views) {
      this.views = views;
   }
   
   
   
}