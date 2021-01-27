import java.text.DecimalFormat;
import java.util.Scanner;

public class No2002 {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        final double PAI = 3.1415927;
        double r,v;
        //输入半径
        while(s.hasNext()){
            r =s.nextDouble();
            //求出体积
            v = 4 * PAI * r * r * r / 3;
            DecimalFormat fm = new DecimalFormat("##.000");
            //调用fm的format方法
            System.out.println(fm.format(v));

        }
    }
}
