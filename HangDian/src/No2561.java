/**
 * @author ：Zeeland
 * @date ：Created in 2020/12/1 15:12
 * @version: 1.0$
 */
import java.util.Arrays;
import java.util.Scanner;
public class No2561 {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        while(s.hasNext()){
            int n =s.nextInt();
            for(int i =0;i <  n;i ++){
                int a =s.nextInt();
                int []arr=new int[a];
                for(int j = 0; j< a;j++){
                    arr[j] = s.nextInt();
                }
                Arrays.sort(arr);
                System.out.println(arr[1]);

            }
        }
    }
}
