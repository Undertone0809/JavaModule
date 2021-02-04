/**
 * @author ：Zeeland
 * @date ：Created in 2021/2/4 11:26
 * @version: 1.0$
 */
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;
public class P5726_2 {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        while(s.hasNext()){
            int n =s.nextInt();
            double []arr=new double[n];
            double sum  = 0;
            for (int i = 0; i < n; i++) {
                arr[i] = s.nextDouble();
                sum += arr[i];
            }
            Arrays.sort(arr);
            DecimalFormat format =new DecimalFormat("#.00");
            System.out.println(format.format((sum-arr[0])-arr[arr.length]/(n-2)));
        }
    }
}
