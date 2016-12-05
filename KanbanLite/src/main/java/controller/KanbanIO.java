package controller;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import controller.mappers.ColumnMapper;
import controller.mappers.TaskMapper;
import model.kanban.Column;
import model.kanban.Kanban;
import model.kanban.Task;

public class KanbanIO {

   protected JdbcTemplate  con;

   public KanbanIO(DataSource dataSource) {
      this.con = new JdbcTemplate(dataSource);
   }
   
   public void addTask(int columnId, Task task){
      String SQL = 
            "INSERT INTO Task " + 
            "(title, description, priority, topicId, columndId, author, resolver, creationDate, completeDate, deadlineDate) " +
            "values (?, ?, ?, ?, ?, ?, ?, ?, ?)";
      con.update(SQL, task.getTitle(), task.getDescription(), 
            task.getPriority(), task.getTopicId(), columnId, task.getAuthor(), task.getResolver(), 
            task.getCreationDate().getTime(), task.getCompleteDate(), 
            task.getDeadlineDate());
      
      
      
      return;
   }
   
   private List<Task> getTasks(int columnId){
      String SQL = "SELECT * FROM Task WHERE columnId = ?";
      List<Task> tasks = con.query(SQL, new Object[] { columnId }, new TaskMapper());
      
      return tasks;
   }
   
   private List<Column> getColumns(){
      String SQL = "SELECT id, name FROM Column";
      List<Column> columns = con.query(SQL, new Object[] { }, new ColumnMapper());
      
      for (Column column : columns){
         column.setTasks(getTasks(column.getId()));
      }
      
      return columns;
   }
   
   public Kanban getKanban(){
      Kanban kanban = new Kanban();
      kanban.setColumns(getColumns());
      return kanban;
   }

}
