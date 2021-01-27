import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

/**
 * @author ：Zeeland
 * @date ：Created in 2021/1/3 15:20
 * @version: 1.0$
 */

public class LN20_PrintStream {
    public static void main(String[] args) throws Exception{
        //PrintStream中不可以实例化Writer，因为它是一个字节流
        PrintStream pr =new PrintStream(new FileOutputStream("log",true));
        //切换数据输出方向
        System.setOut(pr);
        Scanner s =new Scanner(System.in);
        while(s.hasNext()){
            System.out.println(s.next());
        }
    }
}
