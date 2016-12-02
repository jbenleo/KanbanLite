package config;

import java.util.Date;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class View {
   private String   column;
   private String[] tag;
   private String   topic;
   private Boolean  completed;
   private Boolean  deadline;
   private Date     timeToDeadline;
   
   
   public String getColumn() {
      return column;
   }
   @XmlElement
   public void setColumn(String column) {
      this.column = column;
   }
   public String[] getTag() {
      return tag;
   }
   @XmlElement
   public void setTag(String[] tag) {
      this.tag = tag;
   }
   public String getTopic() {
      return topic;
   }
   @XmlElement
   public void setTopic(String topic) {
      this.topic = topic;
   }
   public Boolean getCompleted() {
      return completed;
   }
   @XmlElement
   public void setCompleted(Boolean completed) {
      this.completed = completed;
   }
   public Boolean getDeadline() {
      return deadline;
   }
   @XmlElement
   public void setDeadline(Boolean deadline) {
      this.deadline = deadline;
   }
   public Date getTimeToDeadline() {
      return timeToDeadline;
   }
   @XmlElement
   public void setTimeToDeadline(Date timeToDeadline) {
      this.timeToDeadline = timeToDeadline;
   }
}
