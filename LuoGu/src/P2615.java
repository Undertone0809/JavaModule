/**
 * @author ：Zeeland
 * @date ：Created in 2021/3/2 21:11
 * @version: 1.0$
 */
import java.util.Scanner;
public class P2615 {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        while(s.hasNext()){
            int n = s.nextInt();//n为奇数
            int [][]arr =new int[n+1][n+1];
            arr[1][n/2] = 1;
            //遍历K
            for(int k =2;k<=n*n;k++){
                //若 (K-1)(K−1) 在第一行但不在最后一列，则将 KK 填在最后一行， (K-1)(K−1) 所在列的右一列
                boolean flag1 = false;
                boolean flag2 = false;
                for(int i =1;i<n;i++){
                    if(arr[1][i] == k-1){
                        flag1 = true;
                        break;
                    }
                }
                if(arr[1][n] != k-1){
                    flag2 =true;
                }
            }
            //输出矩阵
            for(int i = 1;i<=n;i++){
                for(int j = 1;j<=n;j++){

                }
            }
        }
    }
}
