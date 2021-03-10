
import java.util.Scanner;

/**
 * @author ：Zeeland
 * @date ：Created in 2021/3/9 19:32
 * @version: 1.0$
 */

public class P1271 {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        while(s.hasNext()){
            int n=s.nextInt();
            int m=s.nextInt();
            int []arr =new int[n+1];
            for (int i = 0; i < m; i++) {
                arr[s.nextInt()]++;
            }
            for (int i = 0; i < arr.length; i++) {
                if(arr[i]!=0){
                    while(arr[i]>0){
                        System.out.print(i+" ");
                        arr[i]--;
                    }
                }
            }
        }
    }
}
