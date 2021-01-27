/**
 * @author ：Zeeland
 * @date ：Created in 2020/12/1 22:40
 * @version: 1.0$
 */
import java.util.Scanner;
public class No2190 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        while(s.hasNext()){
            int []arr=new int[40];
            arr[0] =0;
            arr[1] =1;
            arr[2] =3;
            for(int i=3;i < 40;i++){
                arr[i] =arr[i-1] + 2* arr[i-2];
            }
            int n =s.nextInt();
            for(int i =0;i<n;i++){
                System.out.println(arr[s.nextInt()]);
            }
        }
    }
}
