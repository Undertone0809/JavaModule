/**
 * @author ：Zeeland
 * @date ：Created in 2020/11/26 22:20
 * @version: 1.0$
 */
import java.util.Scanner;
public class No2046 {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        while(s.hasNext()){
            int n =s.nextInt();
            long [] arr =new long[50];
            arr[0] =1;
            arr[1] =2;
            arr[2] =3;
            arr[3] =5;
            for(int i =4;i < arr.length;i++){
                arr[i] =arr[i-1] + arr[i-2];
            }
            System.out.println(arr[n-1]);
        }
    }
}
