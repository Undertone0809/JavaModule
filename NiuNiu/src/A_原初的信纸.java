/**
 * @author ：Zeeland
 * @date ：Created in 2020/12/5 14:53
 * @version: 1.0$
 */
import java.util.Arrays;
import java.util.Scanner;
public class A_原初的信纸 {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        while(s.hasNext()){
            int t=s.nextInt();
            for(int i =0;i< t;i++){
                int n = s.nextInt();
                int []arr =new int[n];
                for(int j=0;j < n;j++){
                    arr[j] = s.nextInt();
                }
                Arrays.sort(arr);
                System.out.println(arr[n-1]);
            }
        }
    }
}
