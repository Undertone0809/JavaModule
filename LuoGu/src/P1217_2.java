/**
 * @author ：Zeeland
 * @date ：Created in 2021/2/3 19:41
 * @version: 1.0$
 */
//算法优化：判断是回文数的同时判断是否为质数
//修改中，不能直接测试
import java.util.Scanner;
public class P1217_2 {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        while(s.hasNext()){
            System.out.println(number(s.nextInt()));
        }
    }
    //判断回文数的方法
    public static boolean isHuiWen(int x){
        int y = x;
        int mid =0;
        while(y != 0){
            mid = mid * 10 + y % 10;
            y/=10;
        }
        if(mid != x) return false;
        else return true;
    }
    //判断质数的方法
    public static boolean isPrime(int x){
        if(x < 2)return false;
        if(x ==2)return true;
        for (int i = 2; i*i <= x; i++) {
            if(x % i == 0) return false;
        }
        return true;
    }
    //判断位数
    public static int number(int x){
        int count =0;
        while(x != 0){
            x /= 10;
            count++;
        }
        return count;
    }
}
