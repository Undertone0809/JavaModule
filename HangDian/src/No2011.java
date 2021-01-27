/**
 * Author:Zeeland
 * Problem Description
 * 多项式的描述如下：
 * 1 - 1/2 + 1/3 - 1/4 + 1/5 - 1/6 + ...
 * 现在请你求出该多项式的前n项的和。
 *
 *
 * Input
 * 输入数据由2行组成，首先是一个正整数m（m<100），表示测试实例的个数，第二行包含m个正整数，对于每一个整数(不妨设为n,n<1000），求该多项式的前n项的和。
 *
 *
 * Output
 * 对于每个测试实例n，要求输出多项式前n项的和。每个测试实例的输出占一行，结果保留2位小数。
 *
 *
 * Sample Input
 * 2
 * 1 2
 *
 *
 * Sample Output
 * 1.00
 * 0.50
 */


import java.text.DecimalFormat;
import java.util.Scanner;

public class No2011 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        while(s.hasNext()){
            int m = s.nextInt();
            for(int i =0;i < m;i++){
                int n =s.nextInt();
                double sum =0;
                //奇数项相加，偶数项相减
                for(double j = 1;j <= n ;j ++){
                    if(j % 2 == 0 && j > 1){
                        sum -= 1/j;
                    }else if(j % 2 == 1 && j > 1){
                        sum += 1/j;
                    }else if(j ==1){
                        sum = 1;
                    }
                }
                DecimalFormat format =new DecimalFormat("0.00");
                System.out.println(format.format(sum));
            }
        }
    }
}
