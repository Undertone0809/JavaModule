/**
 * @author ：Zeeland
 * @date ：Created in 2021/1/31 13:35
 * @version: 1.0$
 */
import java.util.Scanner;
public class P1421 {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        while(s.hasNext()){
            int price = 19;
            int a =s.nextInt();
            int b =s.nextInt();
            int money = a*10+b;
            int num = money / price;
            System.out.println(num);
        }
    }
}
