import java.math.BigInteger;
import java.util.Scanner;

/**
 * @author ：Zeeland
 * @date ：Created in 2020/12/15 11:28
 * @version: 1.0$
 */

public class 进制转换 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        while(s.hasNext()){
            int base =2;
            int num =0;
            String st = Integer.toString(num, base); // 把num当做10进制的数转成base进制的st(base <= 35).
            int num1 = Integer.parseInt(st, base); // 把st当做base进制，转成10进制的int(parseInt有两个参数,第一个为要转的字符串,第二个为说明是什么进制).
            BigInteger m = new BigInteger(st, base); // st是字符串，base是st的进制.

        }
    }
}
