/**
 * @author ：Zeeland
 * @date ：Created in 2021/2/2 17:27
 * @version: 1.0$
 */
import java.math.BigInteger;
import java.util.Scanner;
public class P1888 {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        while(s.hasNext()){
            int a =s.nextInt();
            int b =s.nextInt();
            int c =s.nextInt();
            //让最大值=c
            if(a > c && a > b){
                int temp = a;
                a = c;
                c = temp;
            }else if(b > c && b > a){
                int temp = b;
                b = c;
                c = temp;
            }
            //求出最小的数字
            int min =0;
            if(a > b){
                min = b;
            }else{
                min = a;
            }
            //通过mid约分
            int mid = gcd(min,c);
            System.out.println((min/mid)+"/"+(c/mid));
        }
    }
    public static int gcd(int a,int b){
        return b == 0? a:gcd(b,a%b);
    }
}
