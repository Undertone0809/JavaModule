/**
 * @author ：Zeeland
 * @date ：Created in 2020/12/6 13:50
 * @version: 1.0$
 */
import java.util.Scanner;
public class D_中学数学题 {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        while(s.hasNext()){
            int n =s.nextInt();
            for(int i =0;i<n;i++){
                double num = s.nextDouble();
                for(double j= num-1;j>0;j--){
                    num *= j;
                }
                System.out.println(num);
            }
        }
    }

}
