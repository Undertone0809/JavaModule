/**
 * @author ：Zeeland
 * @date ：Created in 2020/11/30 21:18
 * @version: 1.0$
 */
import java.util.Scanner;
public class No2154 {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        while(s.hasNext()){
            int n =s.nextInt();
            if(n == 0){
                break;
            }
            int temp = n+1;
            if(n < 4){
                temp =5;
            }
            long []arr=new long[temp];
            arr[1] = 0;
            arr[2] = 2;
            arr[3] = 2;
            for(int i=4;i< arr.length;i++){
                arr[i] =(arr[i-1] + 2*arr[i-2])%10000;
            }
            System.out.println(arr[n]);
        }
    }
}
