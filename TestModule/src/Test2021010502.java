/**
 * @author ：Zeeland
 * @date ：Created in 2021/1/5 3:31
 * @version: 1.0$
 */

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;

/**
 * 该方法旨在调用BufferedReader读取文件
 */
public class Test2021010502 {
    public static void main(String[] args) throws Exception{
        //创建流
        FileReader fis =new FileReader("AGENCE.txt");
        BufferedReader reader =new BufferedReader(fis);

        //创建一个空字符串
        //readLine是一行一行字符的读取
        //如果readLine方法读取不到字符的时候会返回一个null
        //这个时候结束程序
        String s ="";
        while((s =reader.readLine()) != null){
            System.out.println(s);
        }

        //关闭流
        if (reader == null) {
            reader.close();
        }

    }
}
