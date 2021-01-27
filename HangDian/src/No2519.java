/**
 * @author ：Zeeland
 * @date ：Created in 2020/11/28 17:13
 * @version: 1.0$
 */

//CAB
//分子：B*(B-1)*...(B-A+1)
//分母：A*(A-1)*3*2*1
import java.text.DecimalFormat;
import java.util.Scanner;
public class No2519 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        while(s.hasNext()){
            int n =s.nextInt();
            for(int i=0;i<n;i++){
                double a =s.nextDouble();//a下
                double b =s.nextDouble();//b上
                method(b,a,i,n);
            }
        }
    }
    public static void method(double a ,double b,int k,int n){
        //A为上，B为下
        double A =a;
        double B =b;
        double Mu = 1;
        double Zi = 1;

        if(a > (b/2)){
            a = b-a;
        }
        for(double i =a;i > 0;i--){
            Mu *= i;
        }
        for(double i=B;i >= B - a+1;i--){
            Zi *= i;
        }
        if(A > B){
            System.out.print(0);
        }else if(A <= B){
            DecimalFormat format =new DecimalFormat("0");
            System.out.print(format.format(Zi/Mu));
        }else if(A ==0){
            System.out.print(1);
        }
            if (k != n) {
                System.out.println();
            }
    }
}
//超出范围