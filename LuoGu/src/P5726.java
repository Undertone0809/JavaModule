/**
 * @author ：Zeeland
 * @date ：Created in 2021/2/4 10:50
 * @version: 1.0$
 */
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;
public class P5726 {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        while(s.hasNext()){
            int n =s.nextInt();
            double []arr =new double[n];
            for (int i = 0; i < n; i++) {
                arr[i] = s.nextDouble();
            }
            Arrays.sort(arr);
            double max = arr[arr.length-1];
            double min = arr[0];
            double sum = 0;
            for (int i = 1; i < arr.length-1; i++) {
                sum += arr[i];
            }
            double average = sum / (n-2);
            DecimalFormat format = new DecimalFormat("#.00");
            String str = format.format(average);
            System.out.println(str);
        }
    }
}
