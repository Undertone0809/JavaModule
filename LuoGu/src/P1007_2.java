/**
 * @author ：Zeeland
 * @date ：Created in 2021/1/31 12:14
 * @version: 1.0$
 */
//AC
import java.util.Scanner;
import java.lang.Math;
public class P1007_2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while(s.hasNext()){
            int len =s.nextInt();
            int num =s.nextInt();
            int mid =0;
            int max = 0;
            int min = 0;

            for (int i = 0; i < num; i++) {
                mid = s.nextInt();
                max = Math.max(max,Math.max(len-mid+1,mid));
                min = Math.max(min,Math.min(len-mid+1,mid));
            }
            System.out.println(min+" "+max);
        }
    }
}
