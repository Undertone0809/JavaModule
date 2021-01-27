/**
 * @author ：Zeeland
 * @date ：Created in 2021/1/24 8:19
 * @version: 1.0$
 */
import java.util.Scanner;
public class No1176_2 {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        while(s.hasNext()){
            int n =s.nextInt();
            if(n ==0){
                break;
            }
        }
    }
    public static void method(int n){
        //create a array with two dimension
        int [][]f = new int[n+1][n+1];

        //initialization
        f[0][5] = 0;
        for(int i =1;i < n;i++){
            for(int j =0;j<n;j++){}
        }

    }
    public static int max(int a,int b,int c){
        int mid = b;
        if(a > mid) mid =a;
        if(c > mid) mid =c;
        return mid;
    }
}
