/**
 * @author ：Zeeland
 * @date ：Created in 2020/12/15 19:06
 * @version: 1.0$
 */
import java.util.Scanner;
public class K1004 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        while(s.hasNext()){
            int t = s.nextInt();
            for(int i =0;i<t;i++){
                long a =s.nextLong();
                long n =s.nextLong();
                for(int j=0;j<n;j++){
                    a += a;
                }
                System.out.println(a);

            }
        }
    }
}
