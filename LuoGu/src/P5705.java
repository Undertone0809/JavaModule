/**
 * @author ：Zeeland
 * @date ：Created in 2021/1/31 12:32
 * @version: 1.0$
 */
import java.util.Scanner;
public class P5705 {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        while(s.hasNext()){
            String str =s.next();
            char []arr =str.toCharArray();
            for (int i = arr.length-1; i>=0; i--) {
                System.out.print(arr[i]);
            }
        }
    }
}
