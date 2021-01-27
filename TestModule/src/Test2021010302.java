import java.io.FileInputStream;
import java.io.IOException;

/**
 * @author ：Zeeland
 * @date ：Created in 2021/1/3 13:43
 * @version: 1.0$
 */

public class Test2021010302 {
    public static void main(String[] args) {
        byte []arr1 = {97,98,99,100};
        System.out.println(new String(arr1,0,4));
        System.out.println("--------------------------------");
        byte []arr=new byte[4];
        FileInputStream fis = null;
        try{
            fis =new FileInputStream("FileRead.txt");
                int readcount =0;
            //            int readcount = fis.read(arr);
//            System.out.println(readcount);
//            readcount =fis.read(arr);
//            System.out.println(readcount);
//            readcount =fis.read(arr);
//            System.out.println(readcount);
            while(readcount != -1){
                readcount = fis.read(arr);
                System.out.println(readcount);
            }
        }catch(Exception e ){
            e.printStackTrace();
        }finally {
            if (fis == null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }

}
