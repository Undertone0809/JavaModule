/**
 * @author ：Zeeland
 * @date ：Created in 2021/2/6 12:19
 * @version: 1.0$
 */
import java.util.Scanner;
public class P1428 {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        while(s.hasNext()){
            int n = s.nextInt();
            int []arr =new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = s.nextInt();
            }
            System.out.print("0"+" ");
            for (int i = 1; i < n; i++) {
                int count =0 ;
                for (int j = 0;j < i;j++){
                    //每一个对比
                    //有一个加一个
                    if(arr[i] > arr[j]){
                        count++;
                    }
                }
                if(i < n-1){
                    System.out.print(count+" ");
                }else{
                    System.out.print(count);
                }
            }

        }
    }
}
