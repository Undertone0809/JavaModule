/**
 * @author ：Zeeland
 * @date ：Created in 2021/3/6 13:53
 * @version: 1.0$
 */
import java.math.BigInteger;
import java.util.Scanner;
public class P1303 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        while(s.hasNext()){
            BigInteger n =s.nextBigInteger();
            System.out.println(n.multiply(s.nextBigInteger()));
        }
    }
}
