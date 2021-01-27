/**
 * @author ：Zeeland
 * @date ：Created in 2020/11/27 22:30
 * @version: 1.0$
 */
import java.util.Scanner;
public class 辗转相除法 {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        while(s.hasNext()) {
            System.out.println(gcd(s.nextInt(), s.nextInt()));
        }
    }

    /**
     *
     * @param a a > b
     * @param b b为被除数
     * @return 最大公约数
     */
    public static int gcd(int a, int b) {
        while(b != 0) {
            int temp = a%b;
            a = b;
            b = temp;
        }
        return a;
    }

}
