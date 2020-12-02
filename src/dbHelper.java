
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class dbHelper {
    private String userName = "root";
    private String password = "password";
    private String dbUrl = "jdbc:mysql://localhost:3306/world?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
    
    public Connection getConnection() throws SQLException{
        
    return DriverManager.getConnection(dbUrl,userName,password);
    }
    
    public void showErrorMessage(SQLException exception){
        System.out.println("Error: " + exception.getMessage());
        System.out.println("Error Code: "+ exception.getErrorCode());
    }
}
