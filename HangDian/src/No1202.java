/**
 * @author ：Zeeland
 * @date ：Created in 2020/12/1 21:12
 * @version: 1.0$
 * 需要的只是两位小数的GPA
 * GPA的求法：点数x学分之和除学分之和
 * 因此无需设置那么多的数组来记录学生的成绩与学分
 * 直接进行求和过程
 * 有两个需要求和的点
 * 第一个是学分的总和
 * 第二个是点数x学分的总和
 * 输入两个点
 * 一个是学分
 * 一个是成绩
 * 如果成绩等于-1则重新输入进行一遍输入的过程
 * 如果成绩不等于-1则进行成绩判断窗口
 * 判断出成绩的点数
 * 然后将对应的点数与学分相乘，纳入第二个总分中
 *如果最后GPA不存在，即所有科目都挂科
 * 就意味着
 * 相除保留两位小数最后输出
 */
import java.util.Scanner;
public class No1202{
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        while(s.hasNext()){
            int n =s.nextInt();
            for(int i =0;i < n;i++){
                double j =0;
            }
        }
    }
}