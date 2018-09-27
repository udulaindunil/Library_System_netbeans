

import static java.lang.Class.forName;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author CHAMOD LAKMALhttp://localhost/phpmyadmin/db_structure.php?server=1&db=codefest&token=cd08f898b609bcf22e63ac83d180637b
 */
public class DBConnection {
    public static Connection getConnection (){
    String url="jdbc:mysql://localhost:3306/mylibrary?zeroDateTimeBehavior=convertToNull";
     String userName = "root";
        String pwd = "";
        Connection con = null;
        try {
            forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection(url, userName, pwd);
       } catch (Exception ex) {
           Logger.getLogger(DBConnection.class.getName()).log(Level.SEVERE, null, ex);
       }
        return con;
    }
    
}
