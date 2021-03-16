import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author ：Zeeland
 * @date ：Created in 2021/3/10 23:35
 * @version: $1.0
 * Arrays.sort
 */

public class P4414_2 {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        while(s.hasNext()){
            int [][]arr =new int[1][3];
            for (int i = 0; i < 4; i++) {
                if(i<3){
                    arr[0][i]=s.nextInt();
                }else{
                    String str =s.next();
                }
            }
            Arrays.sort(arr[0]);
            int i =0;
            arr[0][i]=0;
        }
    }
}
