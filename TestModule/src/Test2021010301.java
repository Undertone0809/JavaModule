/**
 * @author ：Zeeland
 * @date ：Created in 2021/1/3 13:32
 * @version: 1.0$
 */

import java.io.FileInputStream;

/**
 * this test aimed to read the file and write a method to describe it
 */
public class Test2021010301 {
    public static void main(String[] args) {
        ReadFile("D:\\Programming\\idea\\JavaModule\\AGENCE.txt");
    }
    public static void ReadFile(String file){
        byte []arr=new byte[4];
        try{
            FileInputStream fis =new FileInputStream(file);
            int readcount =0;
            while((readcount = fis.read(arr)) != -1){
                System.out.print(new String(arr,0,readcount));
            }
        }catch(Exception e ){
            e.printStackTrace();
        }finally {
            if (arr == null) {

            }
        }

    }
}
