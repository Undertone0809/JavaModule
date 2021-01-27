import java.io.FileInputStream;
import java.io.IOException;

/**
 * @author ：Zeeland
 * @date ：Created in 2021/1/2 20:39
 * @version: 1.0$
 */

public class LN16_FileInputStream {
    public static void main(String[] args) {
        FileInputStream fis =null;
        try{
            fis =new FileInputStream("D:\\Programming\\idea\\JavaModule\\AGENCE.txt");
            byte [] arr = new byte[4];
            int readCount = 0;
            while((readCount =fis.read(arr)) != -1){
                System.out.print(new String(arr,0,readCount));
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally {
            if (fis == null) {
                try{
                    fis.close();
                }catch(IOException  e){
                    e.printStackTrace();
                }
            }
        }
    }
}

