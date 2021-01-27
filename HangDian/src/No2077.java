/**
 * @author ：Zeeland
 * @date ：Created in 2020/11/26 21:12
 * @version: 1.0$
 */
import java.util.Scanner;
public class No2077 {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        while(s.hasNext()){
            int n =s.nextInt();
            int arr[] =new int[20];
            arr[0] = 2;
            arr[1] = 4;
            arr[2] = 10;
            for(int j =3;j < arr.length;j++){
                arr[j] = 3* arr[j-1] -2 ;
            }
            for(int i =0;i < n;i++){
                System.out.println(arr[s.nextInt()-1]);
            }
        }
    }
}
