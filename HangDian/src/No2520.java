/**
 * @author ：Zeeland
 * @date ：Created in 2020/12/13 14:21
 * @version: 1.0$
 */
import java.util.*;
public class No2520 {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        while(s.hasNext()){
            int T = s.nextInt();
            for(int i=0;i < T;i++) {
                long n = s.nextLong();
                System.out.println(n*n%10000);
            }
        }
    }
}
