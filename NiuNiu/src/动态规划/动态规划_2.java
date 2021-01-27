package 动态规划; /**
 * @author ：Zeeland
 * @date ：Created in 2021/1/24 8:41
 * @version: 1.0$
 */
/**
 * 记数型动态规划
 */

import java.util.Scanner;
public class 动态规划_2 {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        while(s.hasNext()){
            int x =s.nextInt();
            int y =s.nextInt();
            System.out.println(method(x,y));
        }
    }
    //定义一个方法，传入(x,y)的矩阵
    //返回方法数
    public static int method(int x,int y){
        int [][] f= new int[x+1][y+1];

        for (int i = 1; i < x+1; i++) {
            for(int j = 1;j < y+1 ;j++){
                //init
                if(i == 0 || j ==0){
                    f[i][j] = 1;
                }
                else{
                    f[i][j] = f[i - 1][j] + f[i][j - 1];
                }
            }
        }
        return f[x][y];
    }
}
