/**
 * @author ：Zeeland
 * @date ：Created in 2020/11/25 21:39
 * @version: 1.0$
 */

import java.util.Arrays;
import java.util.Scanner;
public class No1040 {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        while(s.hasNext()){
            int n =s.nextInt();
            for(int i=0;i<n;i++){
                int m=s.nextInt();
                int []arr= new int[m];
                for(int j=0;j< m;j++){
                    arr[j] = s.nextInt();
                }
                Arrays.sort(arr);
                for(int j=0;j< arr.length;j++){
                    System.out.print(arr[j]);
                    if(j<arr.length-1){
                        System.out.print(" ");
                    }
                }
                System.out.println();

            }
        }
    }
}
