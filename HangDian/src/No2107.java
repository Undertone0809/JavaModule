/**
 * @author ：Zeeland
 * @date ：Created in 2020/11/30 20:50
 * @version: 1.0$
 */
import java.util.Arrays;
import java.util.Scanner;
public class No2107 {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        while(s.hasNext()){
            int n =s.nextInt();
            if(n == 0){
                break;
            }
            int []arr=new int[n];
            for(int i=0;i < n;i++){
                arr[i] =s.nextInt();
            }
            Arrays.sort(arr);
            System.out.println(arr[n-1]);
        }
    }
}
