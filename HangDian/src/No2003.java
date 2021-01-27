import java.text.DecimalFormat;
import java.util.Scanner;

public class No2003 {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        while(s.hasNext()){
            double a = s.nextDouble();
            DecimalFormat ke =new DecimalFormat("###.00");
            System.out.println(ke.format(Math.abs(a)));
        }
    }
}
