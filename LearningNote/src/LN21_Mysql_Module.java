import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * @author ：Zeeland
 * @date ：Created in 2021/2/4 16:17
 * @version: 1.0$
 */
//连接mysql数据库的模板
public class LN21_Mysql_Module {
    public static void main(String[] args) {
        Connection conn  = null;
        Statement stmt = null;
        try{
            //注册驱动
            DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
            //连接数据库
            String url="jdbc:mysql://localhost:3306/mysql";
            String username = "root";
            String password = "lzn123";
            conn =DriverManager.getConnection(url,username,password);

            //check
            System.out.println("connect successful");


            //创建数据库对象
            stmt = conn.createStatement();

            //执行sql语句
            String sql = "insert into bjpowernode.dept(deptno,dname,loc) values(50,'人事部','北京')";
            String sql2 = "delete from bjpowernode.dept where deptno = 50";
            String sql3 ="select * from bjpowernode.emp";

            ResultSet rs= stmt.executeQuery(sql3);
            while(rs.next()){
                System.out.println(rs.getString("ename")+" "+rs.getString("deptno"));
            }
            //executeQuery专门执行DML语句
            //返回影响数据库中的记录条数
//            int count = stmt.executeUpdate(sql2);
//            System.out.println(count ==1 ? "updated successful":"updated failed");

            //处理查询结果


        }catch(Exception e){
            e.printStackTrace();
        }finally{
            //释放内存
            try{
                if(stmt!=null) stmt.close();
            }catch(Exception e ){
                e.printStackTrace();
            }
            try{
                if(conn != null) conn.close();
            }catch(Exception e){
                e.printStackTrace();
            }
        }
    }
}
