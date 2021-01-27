/**
 * @author ：Zeeland
 * @date ：Created in 2021/1/1 22:44
 * @version: 1.0$
 */
import java.util.Arrays;
import java.util.Scanner;
public class 计数器 {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        while(s.hasNext()){
            int n =s.nextInt();
            if(n == 0){
                return;
            }
            int m =s.nextInt();
            int []arr =new int[n];
            arr[0] = s.nextInt();
            for (int i = 1; i < n; i++) {
                arr[i] =  s.nextInt();
            }
            int [] Mo =new int[n];
            Mo[0] = 0;
            for (int i = 0; i < arr.length; i++) {
                if(i > 0){
                    Mo[i] = arr[i] % m;
                }
            }
            Arrays.sort(Mo);
            int count =1;
            for (int i = 0; i < Mo.length; i++) {
                if(i < Mo.length -1 && Mo[i] != Mo[i+1]){
                    count++;
                }
            }
            System.out.println(count);

        }
    }
}
