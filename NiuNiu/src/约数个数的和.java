/**
 * 链接：https://ac.nowcoder.com/acm/problem/14682
 * 来源：牛客网
 *
 * 题目描述
 * 给个n，求1到n的所有数的约数个数的和~
 *
 * 输入描述:
 * 第一行一个正整数n
 * 输出描述:
 * 输出一个整数，表示答案
 * 示例1
 * 输入
 * 复制
 * 3
 * 输出
 * 复制
 * 5
 * 说明
 * 样例解释：
 * 1有1个约数1
 * 2有2个约数1,2
 * 3有2个约数1,3
 */

import java.util.Arrays;
import java.util.Scanner;

public class 约数个数的和{
    public static void main(String[]args){
        Scanner s =new Scanner(System.in);
        while(s.hasNext()){
            int sum = 0;
            int n =s.nextInt();
            //求1-n所有数的约数个数的和
            for (int i =1;i <= n ; i++){
                    sum += i/n;
                }
            System.out.println(sum);
            }


        }
    }

