import java.sql.*;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author ：Zeeland
 * @date ：Created in 2021/1/27 12:50
 * @version: 1.0$
 */

public class LN21_Mysql {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        //指定JDBC驱动
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection myConnection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/mysql",
                "root",
                "lzn123"
        );
        //mystatement  是  Statement  对象；connection  是  Connection  对象；createStatement() 方法返回  Statement对象
        Statement mystatement = myConnection.createStatement();
        ResultSet rs = mystatement.executeQuery ("select * from bjpowernode.emp");

//        ArrayList<Integer> arr = new ArrayList<Integer>();
//        for (int i = 0; i < 10; i++) {
//            arr.add(i);
//        }
//        Iterator<Integer> it =arr.iterator();
//        while(it.hasNext()){
//
//            System.out.println(it.next());
//
//        }
        int count =0;

        //next() return boolean type
        while ( rs.next ( ) ){
            count++;
            System.out.println("cycle :"+count);
            String s1 = rs.getString("ename");
            String s2 = rs.getString("sal");
            System.out.println(s1+":"+s2);
        }
//
//        if( result != null) {                             //判断  ResultSet  对象是否为空
//            result.close();                            //调用  close()  方法关闭  ResultSet  对象
//            result=null;
//        }
//
//        if(  statement != null) {                   //判断  Statement  对象是否为空
//            statement.close();                    //调用  close()  方法关闭 Statement 对象
//            statement=null;
//        }
//        if(  Connection !=null ) {                //判断  Connection  对象是否为空
//            Connection.close();                //调用  close()  方法关闭  Connection  对象
//            Connection=null;
//        }



    }
}
