/**
 * @author ：Zeeland
 * @date ：Created in 2021/1/3 14:56
 * @version: 1.0$
 */

import java.io.*;
public class LN19_BufferedReader {
    public static void main(String[] args) {
        BufferedReader br =null;
        try{
            FileReader reader =new FileReader("AGENCE.txt");
            br =new BufferedReader(reader);
            String s ="";
            while((s = br.readLine()) != null){
                System.out.println(s);
            }

        }catch(Exception e){
            e.printStackTrace();
        }finally{
            if (br == null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
