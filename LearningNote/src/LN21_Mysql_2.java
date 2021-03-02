/**
 * @author ：Zeeland
 * @date ：Created in 2021/1/27 17:49
 * @version: 1.0$
 */
import java.sql.*;
public class LN21_Mysql_2 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        //注册JDBC驱动的两种方式
        //Class.forName("com.mysql.cj.jdbc.Driver");
        DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());

        //建立连接
        Connection myConnection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/mysql",
                "root",
                "lzn123"
        );
        System.out.println("连接成功");
        //创建执行对象
        Statement st = myConnection.createStatement();

        //执行语句
        ResultSet rs= st.executeQuery("select * from bjpowernode.emp");

        //处理结果
        while(rs.next()){
            System.out.println(rs.getString("ename"));
        }
    }
}
