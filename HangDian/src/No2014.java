/**
 * Problem Description
 * 青年歌手大奖赛中，评委会给参赛选手打分。选手得分规则为去掉一个最高分和一个最低分，然后计算平均得分，请编程输出某选手的得分。
 *
 *
 * Input
 * 输入数据有多组，每组占一行，每行的第一个数是n(2<n<=100)，表示评委的人数，然后是n个评委的打分。
 *
 *
 * Output
 * 对于每组输入数据，输出选手的得分，结果保留2位小数，每组输出占一行。
 *
 *
 * Sample Input
 * 3 99 98 97
 * 4 100 99 98 97
 *
 *
 * Sample Output
 * 98.00
 * 98.50
 */

import java.text.DecimalFormat;
import java.util.*;
public class No2014 {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        while(s.hasNext()){
            //输入n组数字
            int n =s.nextInt();
            //创建容量为n的数组
            double [] array = new double[n];
            //将数字赋值到数组中
            for(int i = 0;i < n;i++){
                array[i] = s.nextDouble();
            }
            //排序，去掉最高分和最低分
            //去掉最高分和最低分
            Arrays.sort(array);
            double sum =0;
            //求和
            for(int i =1;i < array.length-1;i++){
                sum +=array[i];
            }
            //除
            sum = sum /(n-2);
            DecimalFormat format = new DecimalFormat("####.00");
            System.out.println(format.format(sum));
        }
    }
}
