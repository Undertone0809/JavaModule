/**
 * @author ：Zeeland
 * @date ：Created in 2021/1/31 11:23
 * @version: 1.0$
 */
//90％ac
import java.util.Arrays;
import java.util.Scanner;
public class P1007 {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        while(s.hasNext()){
            int len =s.nextInt();
            int num =s.nextInt();
            int []arr =new int[num];
            int []max =new int[num];
            int []min =new int[num];
            for (int i = 0; i < num; i++) {
                arr[i] = s.nextInt();
                max[i] =Math.max(len-arr[i]+1,arr[i]);
                min[i] =Math.min(len-arr[i]+1,arr[i]);
            }
            Arrays.sort(max);
            Arrays.sort(min);
            System.out.print(min[num-1]+" "+max[num-1]);
        }
    }
}
