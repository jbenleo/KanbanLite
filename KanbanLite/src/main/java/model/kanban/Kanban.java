package model.kanban;

import java.util.ArrayList;
import java.util.List;

public class Kanban {
   private List<Column> columns = new ArrayList<Column>();

   public List<Column> getColumns() {
      return columns;
   }

   public void setColumns(List<Column> columns) {
      this.columns = columns;
   }
}
