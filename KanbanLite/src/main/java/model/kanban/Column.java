package model.kanban;

import java.util.ArrayList;
import java.util.List;

public class Column {
   private int id;
   private String name;
   private List<Task> tasks = new ArrayList<Task> ();
   
   public String getName() {
      return name;
   }
   public void setName(String name) {
      this.name = name;
   }
   public List<Task> getTasks() {
      return tasks;
   }
   public void setTasks(List<Task> tasks) {
      this.tasks = tasks;
   }
   public int getId() {
      return id;
   }
   public void setId(int id) {
      this.id = id;
   }
}
