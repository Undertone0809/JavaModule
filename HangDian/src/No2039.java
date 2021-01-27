/**
 * Problem Description
 * 给定三条边，请你判断一下能不能组成一个三角形。
 *
 *
 * Input
 * 输入数据第一行包含一个数M，接下有M行，每行一个实例，包含三个正数A,B,C。其中A,B,C <1000;
 *
 *
 * Output
 * 对于每个测试实例，如果三条边长A,B,C能组成三角形的话，输出YES，否则NO。
 *
 *
 * Sample Input
 * 2
 * 1 2 3
 * 2 2 2
 *
 *
 * Sample Output
 * NO
 * YES
 */


/**
 * 注意：
 * 1.如何满足三角形的关系
 * 2.三条边为三个正数，并不是三个整数
 * 因此要使用double数据类型
 */
//Author : Zeeland

import java.util.*;
public class No2039 {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        while(s.hasNext()){
            int n =s.nextInt();
            for (int i =0;i < n;i++){
                double a,b,c =0;

                    //c是最长边
                    a =s.nextDouble();
                    b =s.nextDouble();
                    c =s.nextDouble();
                    if(a > c && a >= b){
                        double temp = a;
                        a = c;
                        c = temp;
                    }else if(b >= a && b >c ){
                        double temp = b;
                        b = c ;
                        c = temp;
                    }

                    //两边之和大于第三边，两边只差小于第三边
                    if(a + b > c && (Math.abs(a - b) < c)){
                        System.out.println("YES");
                    }else{
                        System.out.println("NO");
                    }
                }


        }
    }
}
