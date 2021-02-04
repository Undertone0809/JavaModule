/**
 * @author ：Zeeland
 * @date ：Created in 2021/2/2 18:07
 * @version: 1.0$
 */
import java.util.Scanner;
import java.math.BigInteger;
public class P1009 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while(s.hasNext()){
            int a = s.nextInt();
            BigInteger sum = new BigInteger("0");
            for(int i = a;i > 0;i --){
                //求i的阶乘
                BigInteger num = new BigInteger(i+"");
                for(int j = i-1;j > 0;j--){
                    num =num.multiply(new BigInteger(j+""));
                }
                sum = sum.add(num);
            }
            System.out.println(sum);

        }
    }
}
