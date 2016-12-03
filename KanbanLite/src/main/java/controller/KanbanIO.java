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

   protected JdbcTemplate  jdbcTemplateObject;

   public KanbanIO(DataSource dataSource) {
      this.jdbcTemplateObject = new JdbcTemplate(dataSource);
   }
   
   private List<Task> getTasks(int columnId){
      String SQL = "SELECT * FROM Task WHERE columnId = ?";
      List<Task> tasks = jdbcTemplateObject.query(SQL, new Object[] { columnId }, new TaskMapper());
      
      return tasks;
   }
   
   private List<Column> getColumns(){
      String SQL = "SELECT id, name FROM Column";
      List<Column> columns = jdbcTemplateObject.query(SQL, new Object[] { }, new ColumnMapper());
      
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
