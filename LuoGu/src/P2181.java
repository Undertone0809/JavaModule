/**
 * @author ：Zeeland
 * @date ：Created in 2021/1/31 14:00
 * @version: 1.0$
 */
import java.math.BigInteger;
import java.util.Scanner;
public class P2181 {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        while(s.hasNext()){
            BigInteger n =s.nextBigInteger();
            System.out.println(n.multiply(n.subtract(new BigInteger("1"))).divide(new BigInteger("2")).multiply(n.subtract(new BigInteger("2"))).divide(new BigInteger("3")).multiply(n.subtract(new BigInteger("3"))).divide(new BigInteger("4")));
        }
    }
}
