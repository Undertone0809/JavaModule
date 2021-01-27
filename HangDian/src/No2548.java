/**
 * @author ：Zeeland
 * @date ：Created in 2020/11/29 21:28
 * @version: 1.0$
 */
import java.text.DecimalFormat;
import java.util.Scanner;
public class No2548 {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        while(s.hasNext()){
            int t =s.nextInt();
            for(int i =0;i < t;i++){
                double a =s.nextDouble();//A的速度
                double b =s.nextDouble();//B的速度
                double w =s.nextDouble();//记者的速度
                double l =s.nextDouble();//距离
                double time = 1;
                time = l/(a + b);
                double ki = time * w;
                DecimalFormat format =new DecimalFormat("#.000");
                System.out.println(format.format(ki));

            }
        }
    }
}
