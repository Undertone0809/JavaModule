/**
 * @author ：Zeeland
 * @date ：Created in 2021/3/6 14:32
 * @version: 1.0$
 */
package 天梯赛预选赛;
import java.text.DecimalFormat;
import java.text.Format;
import java.util.Scanner;
public class No7_2 {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        while(s.hasNext()){
            double num = s.nextDouble();
            double zheKou = s.nextDouble();
            double answer =  num * zheKou /10;
            Format format =new DecimalFormat("##.00");
            System.out.println(format.format(answer));
        }
    }
}
