/**
 * @author ：Zeeland
 * @date ：Created in 2021/2/6 12:49
 * @version: 1.0$
 */
import java.util.Scanner;
public class P1047 {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        while(s.hasNext()){
            int l = s.nextInt();
            int []arr =new int[l+1];
            int m = s.nextInt();
            for (int i = 0; i < m; i++) {
                int start = s.nextInt();
                int end = s.nextInt();
                //边界问题
                for(int j =start;j<=end;j++){
                    arr[j] = 1;
                }
            }
            int count = 0;
            for (int i = 0; i < arr.length; i++) {
                if(arr[i] == 0){
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
