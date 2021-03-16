import java.util.Arrays;
import java.util.Scanner;

/**
 * @author ：Zeeland
 * @date ：Created in 2021/3/10 23:12
 * @version: 1.0$
 */

public class P5715 {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        while(s.hasNext()){
            int []arr =new int[3];
            for (int i = 0; i < 3; i++) {
                arr[i] =s.nextInt();
            }
            Arrays.sort(arr);
            for (int i : arr) {
                System.out.print(i+" ");
            }
        }
    }
}
