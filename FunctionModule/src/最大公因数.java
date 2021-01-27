/**
 * @author ：Zeeland
 * @date ：Created in 2020/12/6 14:03
 * @version: 1.0$
 */
import java.util.*;
public class 最大公因数 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int e = a;
        for (int i = 1; i <= e; i++) {

            int c = a > b ? a : b;//两个数字的大值
            int d = a < b ? a : b;//两个数字的小值

            a = c % d;
            b = d;

            if (a == 0) {
                System.out.println(d);
                return;
            }
        }
    }

    //方法1
    /* 迭代法（递推法）：欧几里得算法，计算最大公约数 */
    public static int gcd1(int a, int b) {
        if (b == 0)
            return a;
        else
            return gcd1(b, a % b);

        // b==0?a:gcd(b,a%b);
    }

    //方法二
    //辗转相除法
    public static int gcd2(int a, int b) {
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

    //二进制算法
    public static int gcd3(int x, int y) {
        int i, j, t;
        if (x == 0)
            return y;
        if (y == 0)
            return x;
        for (i = 0; 0 == (x & 1); x >>= 1, ++i) ;
        for (j = 0; 0 == (y & 1); y >>= 1, ++j) ;
        if (j < i)
            i = j;
        for (; ; ) {
            if (x < y) {
                t = y;
                y = x;
                x = t;
            }
            if (0 == (x -= y))
                return y << i;
            for (; 0 == (x & 1); x >>= 1) ;
        }
    }
        //加速二进制算法(C++)
    /*public static int gcd ( int a, int b) {
        while (b ^= a ^= b ^= a %= b) ;
        return a;
    }*/
    /**
     * 更相减损术
     * @param a
     * @param b
     * @return
     */
    public static Map<String, Object> math(int a, int b){
        Map<String, Object>  map = new HashMap<>();
        int count = 0;
        int temp = 0;
        int max =0;
        for(;a%2==0 && b%2==0;){
            a=a/2;
            b=b/2;
            count++;
        }
        out :
        while((a-b>0 && a-b !=b) ||(b>a && b-a != a) || a == b || b-a == a || a - b == b){
//        while(a-b==0 || b-a==0){
            if (a == b ) {
                temp = b;
                break out;
            }else if ( b>a && b-a != a) {
                temp = b-a;
                b = temp;
            }else if (a-b>0 && a-b !=b) {
                temp = a-b;
                a = temp;
            }else if (b-a == a ) {
                temp = a;
                break out;
            }else if (a - b == b ) {
                temp = b;
                break out;
            }
        }
        max = (int) Math.pow(2, count) * temp;
        //计算到最后a的值
        map.put("a", a);
        //计算到最后b的值
        map.put("b", b);
        //表示共同被2整除的次数
        map.put("count", count);
        //最后求得的最大公约数
        map.put("max", max);
        return map;
        /**
         * 调用方法
         * public static void main(String[] args) {
         *         //在这里输入你要求的两个数
         *         Map<String, Object>  map = math(98,63);
         *         for(Map.Entry<String, Object> entry:map.entrySet()){
         *             System.out.println(entry.getKey()+"----"+entry.getValue());
         *         }
         *
         *     }
         */
    }
    //更相减损法
    //num3 > num4
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
    /**
     *         int tt1 = 120;
     *         int tt2 = 92;
     *         //辗转相除法和更相减损法的结合
     * 		//辗转相除法，大数相除性能较低
     * 		//更相减损法，循环运算次数过多
     * 		int base = 1;
     * 		while(tt1 != tt2){
     *         //保证tt1 是较大的数
     * 			if(tt1 < tt2){
     * 				int temp = tt1;
     * 				tt1 = tt2;
     * 				tt2 = temp;
     *                        }
     *             //双偶
     * 			if(tt1 % 2 == 0 && tt2 % 2 == 0){
     * 				tt1 = tt1>>1;
     * 				tt2 = tt2>>1;
     * 				base = base * 2;
     *             //奇偶
     *            }else if(tt1 % 2 == 0 && tt2 % 2 != 0){
     * 				tt1 = tt1>>1;
     *             //偶奇
     *            }else if(tt1 % 2 != 0 && tt2 % 2 == 0){
     * 				tt2 = tt2>>1;
     *             //双奇
     *            }else if(tt1 % 2 != 0 && tt2 % 2 != 0){
     * 				int temp = tt2;
     * 				tt2 = tt1 - tt2;
     * 				tt1 = temp;
     *            }* 		}
     * 		System.out.println("最大公约数为：" + tt2 * base);
     */
    //实际上这种算法时间复杂度并不小
    public static int gcd5(int tt1,int tt2){
        //辗转相除法和更相减损法的结合
        //辗转相除法，大数相除性能较低
        //更相减损法，循环运算次数过多
        int base = 1;
        while(tt1 != tt2){
            //保证tt1 是较大的数
            if(tt1 < tt2){
                int temp = tt1;
                tt1 = tt2;
                tt2 = temp;
            }
            //双偶
            if(tt1 % 2 == 0 && tt2 % 2 == 0){
                tt1 = tt1>>1;
                tt2 = tt2>>1;
                base = base * 2;
                //奇偶
            }else if(tt1 % 2 == 0 && tt2 % 2 != 0){
                tt1 = tt1>>1;
                //偶奇
            }else if(tt1 % 2 != 0 && tt2 % 2 == 0){
                tt2 = tt2>>1;
                //双奇
            }else if(tt1 % 2 != 0 && tt2 % 2 != 0){
                int temp = tt2;
                tt2 = tt1 - tt2;
                tt1 = temp;
            }
        }
        return tt2*base;
    }
}