package model.kanban;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Task {
   private String title = "";
   private String description = "";
   private int priority = 0;
   private String topic = "";
   private int color;
   private List<Tag> tags = new ArrayList<Tag>();
   private List<SubTask> subTasks = new ArrayList<SubTask>();
   private String author ="";
   private String resolver ="";
   private Date creationDate = null;
   private Date completeDate = null;
   private Date deadlineDate = null;
   
   
   public String getTitle() {
      return title;
   }
   public void setTitle(String title) {
      this.title = title;
   }
   public String getDescription() {
      return description;
   }
   public void setDescription(String description) {
      this.description = description;
   }
   public int getPriority() {
      return priority;
   }
   public void setPriority(int priority) {
      this.priority = priority;
   }
   public String getTopic() {
      return topic;
   }
   public void setTopic(String topic) {
      this.topic = topic;
   }
   public int getColor() {
      return color;
   }
   public void setColor(int color) {
      this.color = color;
   }
   public List<Tag> getTags() {
      return tags;
   }
   public void setTags(List<Tag> tags) {
      this.tags = tags;
   }
   public List<SubTask> getSubTask() {
      return subTasks;
   }
   public void setSubTask(List<SubTask> subTasks) {
      this.subTasks = subTasks;
   }
   public String getAuthor() {
      return author;
   }
   public void setAuthor(String author) {
      this.author = author;
   }
   public String getResolver() {
      return resolver;
   }
   public void setResolver(String resolver) {
      this.resolver = resolver;
   }
   public Date getCreationDate() {
      return creationDate;
   }
   public void setCreationDate(Date creationDate) {
      this.creationDate = creationDate;
   }
   public Date getCompleteDate() {
      return completeDate;
   }
   public void setCompleteDate(Date completeDate) {
      this.completeDate = completeDate;
   }
   public Date getDeadlineDate() {
      return deadlineDate;
   }
   public void setDeadlineDate(Date deadlineDate) {
      this.deadlineDate = deadlineDate;
   }
   
   public void addTag(Tag tag){
      tags.add(tag);
   }
   
   public void addSubTask(SubTask subTask){
      subTasks.add(subTask);
   }
}
