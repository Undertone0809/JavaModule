/**
 * @author ：Zeeland
 * @date ：Created in 2020/12/6 15:22
 * @version: 1.0$
 */
import java.util.Scanner;
public class L_母牛上树 {
    public static final double PAI = 3.1415926535;
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        while(s.hasNext()){
            int n  =s.nextInt();
            for(int i=0;i<n;i++){
                //输入4个数字
                double a=s.nextDouble();
                double b=s.nextDouble();
                double R=s.nextDouble();
                double H=s.nextDouble();
                //如果有一个为360°的情况
                if(a ==360){
                    a =0;
                }else if(b ==360){
                    b =0;
                }
                //保证a>b
                if(a < b){
                    double temp  = b;
                    b = a;
                    a =temp;
                }
                //保证角度差小于180
                double mid = a - b;
                if(mid > 180){
                    mid = 360 - mid;
                }
                double l =(PAI*R*mid/180)*(PAI*R*mid/180)+H*H;
                System.out.printf("%.2f\n",l);

            }
        }
    }
}
