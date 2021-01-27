/**
 * @author ：Zeeland
 * @date ：Created in 2021/1/5 3:24
 * @version: 1.0$
 */

import java.io.FileReader;

/**
 * 本程序旨在测试调用字符输入流读取文件FileReader
 */
public class Test20200105 {
    public static void main(String[] args)throws Exception {
        //创建字符输入流
        FileReader reader =new FileReader("AGENCE.txt");

        //创建一个char数组，用于接受读取的内容
        char []arr =new char[4];
        int readcount =0;


        //输出char数组
        while((readcount = reader.read(arr)) != -1){
            System.out.print(arr);
        }

        //关闭流
        if (reader == null) {
            reader.close();
        }
    }
}
