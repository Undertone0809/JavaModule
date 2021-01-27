/**
 * @author ：Zeeland
 * @date ：Created in 2020/11/26 20:34
 * @version: 1.0$
 */
import  java.util.Scanner;
public class No2160 {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        while(s.hasNext()){
            int n =s.nextInt();
            int []arr=new int[21];
            arr[0] = 1;
            arr[1] = 2;
            arr[2] = 3;
            for(int j=3;j< arr.length;j++){
                arr[j] = arr[j-1] + arr[j-2] ;
            }
            for(int i= 0;i< n ;i++){
                int m =s.nextInt();
                System.out.println(arr[m-1]);
            }
        }
    }
}
