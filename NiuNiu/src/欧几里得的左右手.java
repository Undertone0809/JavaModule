/**
 * @author ：Zeeland
 * @date ：Created in 2020/12/24 20:53
 * @version: 1.0$
 */
//最大公倍数不是1的数字就是answer
//思路：
import java.util.Scanner;
public class 欧几里得的左右手 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        while(s.hasNext()){
            long m =s.nextLong();
            long n =s.nextLong();
            if(gcd(m,n)  == 1){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }

        }
    }
    public static long gcd(long a,long b){
        if(b == 0){
            return a;
        }else{
            return gcd(b,a % b);
        }
    }
}
