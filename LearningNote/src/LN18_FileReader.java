import java.io.FileReader;
import java.io.IOException;

/**
 * @author ：Zeeland
 * @date ：Created in 2021/1/3 14:37
 * @version: 1.0$
 */

public class LN18_FileReader {
    public static void main(String[] args) {
        FileReader reader = null;
        try{
            reader = new FileReader("AGENCE.txt");
            char []arr =new char[4];
            int readcount =0;
            while((readcount = reader.read(arr)) != -1){
                System.out.print(new String(arr,0,readcount));
            }
        }catch(Exception e) {
            e.printStackTrace();
        }finally{
            if (reader == null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
