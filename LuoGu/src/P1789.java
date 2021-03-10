/**
 * @author ：Zeeland
 * @date ：Created in 2021/3/3 16:16
 * @version: 1.0$
 */
import java.util.Scanner;
import java.lang.Math;

public class P1789 {
    //判断是否越界
    public static boolean method(int x,int y,int n){
        return x >= 1 && y >= 1 && x <= n && y <= n;
    }

    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        while(s.hasNext()){
            //第一行输入
            int n = s.nextInt();//n*n的矩阵
            int m = s.nextInt();//火把的数量
            int k = s.nextInt();//萤石的数量
            //创建地形矩阵,忽略(0,0)
            int [][]place = new int[n+1][n+1];

            int x,y =0;
            for (int i = 1; i <= k+m; i++) {
                x = s.nextInt();//x
                y = s.nextInt();//y
                for(int lx=-2;lx<=2;lx++) {
                    for (int ly =-2; ly <=2; ly++) {
                        //高级code
                        if((i > m || Math.abs(lx)+ Math.abs(ly) <= 2) && method(lx + y, x + ly,n)){
                            place[lx+x][ly+y] =1;
                        }
                    }
                }
            }

            int count =0;
            for(int i=1;i<=n;i++){
                for(int j=1;j<=n;j++){
                    if(place[i][j]==0)count++;
                }
            }
//
//            for(int i=1;i<=n;i++){
//                for(int j=1;j<n;j++){
//                    System.out.print(place[i][j]+" ");
//                }
//                System.out.println(place[i][n]);
//            }
            System.out.println(count);
        }
    }
}
