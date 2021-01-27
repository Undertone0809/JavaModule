import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author ：Zeeland
 * @date ：Created in 2021/1/27 12:50
 * @version: 1.0$
 */

public class LN21_Mysql {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        //指定JDBC驱动
        Class.forName("com.mysql.jdbc.Driver");
        Connection myConnection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/test",
                "root",
                "l287017217"
        );
        System.out.println("here");

    }
}
