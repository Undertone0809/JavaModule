/**
 * @author ：Zeeland
 * @date ：Created in 2020/11/26 23:16
 * @version: 1.0$
 */

import java.util.Scanner;
public class No2501 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        while(s.hasNext()){
            int n=s.nextInt();
            int []arr=new int[30];
            arr[0] = 1;
            arr[1] = 3;
            arr[2] = 5;
            arr[3] = 11;
            for(int i =4;i < arr.length;i++){
                arr[i] = arr[i-1] + 2*arr[i-2];
            }
            for(int i=0;i < n;i++){
                int a =s.nextInt();
                System.out.println(arr[a-1]);
            }
        }
    }
}
