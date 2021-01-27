/**
 * @author ：Zeeland
 * @date ：Created in 2020/12/24 19:38
 * @version: 1.0$
 */
//求三组数字的最小公倍数
import java.util.Scanner;

public class 晨跑 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        while(s.hasNext()){
            long a=s.nextLong();
            long b=s.nextLong();
            long num = lcm(a,b);
            long c=s.nextLong();
            System.out.println(lcm(num,c));
        }
    }
    public static long gcd(long a,long b ){
        if(b == 0){
            return a;
        }else{
            return gcd(b,a % b);
        }
    }
    public static  long lcm(long a,long b){
        long temp = a * b /gcd(a,b);
        return temp;
    }
}
