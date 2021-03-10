/**
 * @author ：Zeeland
 * @date ：Created in 2021/3/6 12:52
 * @version: 1.0$
 */
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;


/**
 * 是不是可以不用判断两个约数是否是质数然后直接输出？
 */

public class P1075 {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        while(s.hasNext()){
            int p =s.nextInt();
            HashSet<Integer> set= new HashSet<>();
            //质数循环
            for(int i=2;i<=Math.sqrt(p);i=nextZhiShu(i)){
                //可以被整除
                if(p%i==0&&isZhiShu(p/i)){
                    System.out.println(p/i);
                    break;//只要取第一个数就好了
                }
            }
        }
    }

    //找到下一个质数
    public static int nextZhiShu(int num){
        for(int i=num+1;;i++){
            if(isZhiShu(i)) return i;
        }
    }
    public static boolean isZhiShu(int num) {
        if (num < 2) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}
