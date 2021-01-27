/**
 * @author ：Zeeland
 * @date ：Created in 2020/12/6 14:06
 * @version: 1.0$
 */
import java.util.*;
public class E_枚举求和 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while (s.hasNext()) {
            //long startTime = System.currentTimeMillis();    //获取开始时间
            int num = s.nextInt();
            for (int i = 0; i < num; i++) {
                int n = s.nextInt();
                int m = s.nextInt();
                int k = s.nextInt();
                //判断单个输出值
                int sum = 0;
                for (int j = 1; j <= n; j++) {
                    for (int g = 1; g <= m; g++) {
                           if(j % k ==0&& g % k ==0){
                               sum +=1;
                           }
                            /*if (gcd4(j, g) % k == 0) {
                                sum += 1;
                            }*/
                        }
                    }
                    System.out.println(sum);
                }
            //long endTime = System.currentTimeMillis();    //获取结束时间
            //System.out.println("程序运行时间：" + (endTime - startTime) + "ms");    //输出程序运行时间
        }
    }


    public static int gcd1(int a, int b) {
        int gcd = 0, c;
        if (a > b) {
            while (b != 0) {
                a = a % b;
                if (a < b) {
                    c = a;
                    a = b;
                    b = c;
                }
                gcd = a;
            }
        }
        if (a == b)
            gcd = a;
        else {
            c = a;
            a = b;
            b = c;
            while (b != 0) {
                a = a % b;
                if (a < b) {
                    c = a;
                    a = b;
                    b = c;
                }
                gcd = a;
            }
        }
        return gcd;
    }
    public static int gcd4(int num3 ,int num4) {
        while (num3 != num4) {
            int temp = num4;
            if (num4 > num3) {
                temp = num4;
                num4 = num3;
                num3 = temp;
            }
            num4 = num3 - num4;
            num3 = temp;
        }
        return num3;
    }
}



