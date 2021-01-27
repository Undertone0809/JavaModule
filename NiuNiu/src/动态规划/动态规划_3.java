package 动态规划; /**
 * @author ：Zeeland
 * @date ：Created in 2021/1/24 10:03
 * @version: 1.0$
 */

/**
 * 存在型动态规划
 */
import java.util.Scanner;
public class 动态规划_3 {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        while(s.hasNext()){
            int n =s.nextInt();
            int []A= new int[n];
            for (int i = 0; i < n; i++) {
                A[i] = s.nextInt();
            }
            System.out.println(method(A));

        }
    }
    public static boolean method(int[]A){
        int n =A.length;
        //创建数组
        //跳到n-1
        boolean []f=new boolean[n];
        //initialization
        f[0] = true;
        for(int j =1;j<n;j++){
            f[j] =false;
            for(int i=0;i<j;i++){
                if(i + A[j] >= j && f[i]){
                    //如果可以跳到i
                    //且在i处跳的最远的距离可以跳到j
                    f[j] =true;
                }
            }
        }
        return f[n-1];
    }
}
