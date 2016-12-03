package model.config;

import java.util.Date;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class View {
   private String   name;
   private String[] columns;
   private String[] tags;
   private String[] topics;
   private Boolean  completed;
   private Boolean  deadline;
   private Date     timeToDeadline;
   
   @XmlElementWrapper
   @XmlElement (name = "column")
   public String[] getColumns() {
      return columns;
   }
   
   public void setColumns(String[] columns) {
      this.columns = columns;
   }
   
   @XmlElementWrapper
   @XmlElement ( name = "tag")
   public String[] getTags() {
      return tags;
   }
   
   public void setTags(String[] tags) {
      this.tags = tags;
   }
   
   @XmlElementWrapper
   @XmlElement ( name = "topic")
   public String[] getTopics() {
      return topics;
   }
   
   public void setTopics(String[] topics) {
      this.topics = topics;
   }
   @XmlElement
   public Boolean getCompleted() {
      return completed;
   }
   
   public void setCompleted(Boolean completed) {
      this.completed = completed;
   }
   @XmlElement
   public Boolean getDeadline() {
      return deadline;
   }
   
   public void setDeadline(Boolean deadline) {
      this.deadline = deadline;
   }
   @XmlElement
   public Date getTimeToDeadline() {
      return timeToDeadline;
   }
   
   public void setTimeToDeadline(Date timeToDeadline) {
      this.timeToDeadline = timeToDeadline;
   }

   @XmlElement
   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }
}
