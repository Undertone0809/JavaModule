/**
 * @author ：Zeeland
 * @date ：Created in 2020/11/21 21:07
 * @version: 1.0$
 * Problem Description
 * 假设一个班有n(n<=50)个学生，每人考m(m<=5)门课，求每个学生的平均成绩和每门课的平均成绩，并输出各科成绩均大于等于平均成绩的学生数量。
 *
 *
 * Input
 * 输入数据有多个测试实例，每个测试实例的第一行包括两个整数n和m，分别表示学生数和课程数。然后是n行数据，每行包括m个整数（即：考试分数）。
 *
 *
 * Output
 * 对于每个测试实例，输出3行数据，第一行包含n个数据，表示n个学生的平均成绩，结果保留两位小数；第二行包含m个数据，表示m门课的平均成绩，结果保留两位小数；第三行是一个整数，表示该班级中各科成绩均大于等于平均成绩的学生数量。
 * 每个测试实例后面跟一个空行。
 *
 *
 * Sample Input
 * 2 2
 * 5 10
 * 10 20
 *
 *
 * Sample Output
 * 7.50 15.00
 * 7.50 15.00
 * 1
 *
 */
import java.text.DecimalFormat;
import java.util.Scanner;
public class No2023 {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        while(s.hasNext()){
            int n = s.nextInt(),m=s.nextInt();
            double []sub =new double[m];
            double []man =new double[n];
            double [][]alma =new double[n][m];
            for(int i=0;i < n;i++){
                double sum  =0;
                for(int j =0;j < m;j++){
                    double score =s.nextInt();
                    alma[i][j] =score;
                    sub[j] +=score;
                    sum +=score;
                }
                man[i] =  sum/m;
            }

        for(int i =0;i <sub.length;i++){
            sub[i] /= n;
        }
        DecimalFormat format =new DecimalFormat("#####.00");
        for(int i =0;i<man.length;i++){
            System.out.print(String.format("%.2f",man[i]));
            if(i < man.length-1){
                System.out.print(" ");
            }
        }
            System.out.println();
        for(int i =0;i <sub.length;i++){
            System.out.print(String.format("%.2f",sub[i]));
            if(i < sub.length-1){
                System.out.print(" ");
            }
        }
            System.out.println();
        int count2 =0;
        for(int i =0;i < alma.length;i++){
            int count1 =0;
            for(int j =0;j < alma[0].length;j++){
                if(alma[i][j] >= sub[j]){
                    count1++;
                }
            }
            if(count1 == m){
                count2++;
            }
        }
            System.out.println(count2);
            System.out.println();
        }
    }
}
