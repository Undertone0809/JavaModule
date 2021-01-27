/**
 * @author ：Zeeland
 * @date ：Created in 2020/11/24 14:57
 * @version: 1.0$
 */
import java.text.DecimalFormat;
import java.util.Scanner;
public class No2090 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double num=0;
        while(in.hasNext()) {
            String c=in.next();
            double n=in.nextDouble();
            double m=in.nextDouble();
            num=num+n*m;
        }
        System.out.printf("%.1f",num);
        System.out.println();
    }
}