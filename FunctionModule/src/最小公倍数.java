import java.math.BigInteger;

/**
 * @author ：Zeeland
 * @date ：Created in 2020/12/14 23:38
 * @version: 1.0$
 * (1)多组数据求最小公倍数考虑No1019
 * 最小公倍数=a * b /最小公倍数
 */

public class 最小公倍数 {

    //方法1：递归
    //gcd为最大公倍数
    public static int gcd(int a, int b) {
        /**
         * 最小公倍数
         */
        return b==0?a:gcd(b, a%b);
    }

    public static int lcm(int a, int b) {
        /**
         * 最大公约数
         */
        return a*b/gcd(a, b);
    }

    //方法2:从大的那个数开始遍历,如果num % a ==0 num % b ==0
    public static void lcm2(int a,int b){
        if(a < b){
            int temp = b;
            b = a;
            a = temp;
        }
        boolean ki =true;
        int temp =0;
        for (int i = a;ki; i++) {
            if(i % a ==0 && i % b ==0){
                ki = false;
                temp =i;
            }
        }
        System.out.println(temp);
    }
}
