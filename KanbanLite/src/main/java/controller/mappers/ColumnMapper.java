package controller.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import model.kanban.Column;

public class ColumnMapper implements RowMapper<Column> {

   @Override
   public Column mapRow(ResultSet rs, int numRow) throws SQLException {
      Column column = new Column();
      column.setId(rs.getInt("id"));
      column.setName(rs.getString("name"));
      
      return column;
   }

}
