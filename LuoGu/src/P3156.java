import java.util.Scanner;

/**
 * @author ：Zeeland
 * @date ：Created in 2021/3/10 17:27
 * @version: 1.0$
 */

public class P3156 {
    public static int []arr;
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        while(s.hasNext()){
            int n =s.nextInt();
            int m =s.nextInt();
            arr =new int[n+1];
            for (int i = 1; i <= (m + n); i++) {
                if(i<=n){
                    arr[i] =s.nextInt();
                }else{
                    System.out.println(arr[s.nextInt()]);
                }
            }
        }
    }
}
