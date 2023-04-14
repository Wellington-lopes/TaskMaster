
package TaskMaster.Controller;

import TaskMaster.Model.Task;
import java.sql.Date;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import util.ConnectionFactory;

public class taskController {
    
    public void save(Task task){
        String sql = "INSERT INTO tasks (idProject"
                + "name," 
                + "description," 
                + "completed," 
                + "notes," 
                + "deadline," 
                + "createdAt," 
                + "updateAt) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        
        Connection connection = null;
        PreparedStatement  statement = null;
        
            try{
                connection = ConnectionFactory.getConnection();
                statement = connection.prepareStatement(sql);
                statement.setInt(1, task.getIdProject());
                statement.setString(2, task.getName());
                statement.setString(3, task.getDescription());
                statement.setBoolean(4, task.isIsCompleted());
                statement.setString(5, task.getNotes());
                statement.setDate(6, new Date(task.getDeadline().getTime()));
                statement.setDate(7, new Date(task.getCreateAt().getTime()));
                statement.setDate(8, new Date(task.getUpdateAt().getTime()));
                statemen.
                
            } catch (Exception ex) {
                throw new RuntimeException("Erro ao salvar a tarefa " 
                        + ex.getMessage(), ex);
            } finally {
                ConnectionFactory.closeConnection(connection);
            }
        
    }
    
      public void update(Task task){
    }
    
      public void removeById(int taskId) throws SQLException{
          
          String sql = "DELETE FROM tasks WHERE ID = ?";
          
          Connection conn = null;
          PreparedStatement statement = null;
          
          try {
              conn = ConnectionFactory.getConnection();
              statement = conn.prepareStatement(sql);
              statement.setInt(1, taskId);
              statement.execute();
          } catch (SQLException e) {
              throw new SQLException("Erro ao deletar a tarefa");
          } finally {
              ConnectionFactory.closeConnetion(conn);
          }
    }
      
      public List<Task> getAll(int idProject){
          return null;
    }
}
