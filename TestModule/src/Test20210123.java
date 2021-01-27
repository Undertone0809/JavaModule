/**
 * @author ：Zeeland
 * @date ：Created in 2021/1/23 21:02
 * @version: 1.0$
 */
import java.util.Scanner;
import java.lang.Integer;
import java.lang.Math;
//动态规划
public class Test20210123 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while (s.hasNext()) {
            //先传入一个数组
            //硬币个数
            int n = s.nextInt();
            int []A= new int[n];
            //硬币值
            for (int i = 0; i < n; i++) {
                A[i] = s.nextInt();
            }
            //value值
            int value = s.nextInt();
            //调用method方法
            System.out.println(method(A,value));
        }
    }


    //定义一个方法
    //传入一个数组是硬币的种类
    //传入一个value
    public static int method(int []A,int value) {
        //f[0] f[1].... f[27]
        int[] f = new int[value + 1];
        int n = A.length;

        //init
        f[0] = 0;

        //给除了f[0]以外的数字赋值
        for (int i = 1; i <= value; i++) {
            f[i] = Integer.MAX_VALUE;
            for (int j = 0; j < n; j++) {
                //转移方程
                //转移方程的前置条件
                //(1)f[index]中index要>=0
                //f[i - A[j]]不能为正无穷
                if(i >= A[j]  &&f[i -A[j]] != Integer.MAX_VALUE){
                    f[i] = Math.min(f[i - A[j]] + 1, f[i]);
                }
            }
        }
        if(f[value] == Integer.MAX_VALUE){
            return -1;
        }
        return f[value];
    }
}