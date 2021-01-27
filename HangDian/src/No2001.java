import java.text.DecimalFormat;
import java.util.Scanner;

public class No2001 {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        //输入两组数据，计算两组数据的距离
        //Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2))
        //调用Math.sqrt()
        while(s.hasNext()){
            double x1 =s.nextDouble();
            double y1 =s.nextDouble();
            double x2 =s.nextDouble();
            double y2 =s.nextDouble();
            double ki = Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
            //保留两位小数
            DecimalFormat k =new DecimalFormat("#.00");
            System.out.println(k.format(ki));
        }
    }
}
