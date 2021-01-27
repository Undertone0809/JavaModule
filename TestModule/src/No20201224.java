/**
 * @author ：Zeeland
 * @date ：Created in 2020/12/24 19:55
 * @version: 1.0$
 */
import java.math.BigInteger;
import java.util.Scanner;
public class No20201224 {
    public static void main(String[] args) {
        //alt + ctrl + l
        Scanner s = new Scanner(System.in);
        while (s.hasNext()) {
            BigInteger num1 = new BigInteger("81");
            BigInteger num2 = new BigInteger("9");
            System.out.println("输出了num1的ToString方法：" + num1.toString());//重写了ToString方法
            System.out.println("输出了num1：" + num1);
            System.out.println(num1.gcd(num2));
            System.out.println("--------------------------------------");
            //输出gcd函数
            int a = s.nextInt();
            int b = s.nextInt();
            System.out.println("方法1:" + gcd(a, b));
            System.out.println("方法2:" + gcd2(a, b));
            System.out.println("------------------------");
            lcm2(a,b);

        }
    }
    public static int  gcd(int a,int b){
        if(a<b){
            int temp =a;
            a = b;
            b = temp;
        }
        int c =1;
        int temp =0;
        //do while
        do{
            c = a % b;
            a = b;
            temp =b;
            b = c;
        }while(c != 0);
        return temp;

    }
    public static int gcd2(int a,int b ){
        if(b == 0){
            return a;
        }else{
            return gcd2(b,a % b);
        }
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
        System.out.println("最小公倍数是"+temp);
    }
}

/**
 * int 4个byte
 * 一个byte占用8个二进制位
 * 所以4*8=32
 * 2.pow(32) -1
 */