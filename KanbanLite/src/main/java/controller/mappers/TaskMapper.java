package controller.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import model.kanban.Task;

public class TaskMapper implements RowMapper<Task> {

   @Override
   public Task mapRow(ResultSet rs, int rowNum) throws SQLException {
      Task task = new Task();
      
      task.setAuthor(rs.getString("author"));
      task.setColor(rs.getInt("color"));
      
      return task;
   }

}
