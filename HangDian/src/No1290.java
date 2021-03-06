/**
 * Problem Description
 * 或许你曾经牢骚满腹
 * 或许你依然心怀忧伤
 * 或许你近在咫尺
 * 或许你我天各一方
 *
 * 对于每一个学子
 * 母校
 * 永远航行在
 * 生命的海洋
 *
 * 今年是我们杭电建校五十周年，这是一个值得祝福的日子。我们该送给母校一个怎样的礼物呢？对于目前的大家来说，最好的礼物当然是省赛中的好成绩，我不能参赛，就送给学校一个DOOM III球形大蛋糕吧，这可是名牌，估计要花掉我半年的银子呢。
 *
 * 想象着正式校庆那一天，校长亲自操刀，把这个大蛋糕分给各地赶来祝贺的校友们，大家一定很高兴，呵呵，流口水了吧...
 *
 * 等一等，吃蛋糕之前先考大家一个问题：如果校长大人在蛋糕上切了N刀（校长刀法极好，每一刀都是一个绝对的平面），最多可以把这个球形蛋糕切成几块呢？
 *
 * 做不出这个题目，没有蛋糕吃的！
 * 为-了-母-校-，为-了-蛋-糕-（不是为了DGMM，枫之羽最会浮想联翩...），加-油-！
 *
 *
 * Input
 * 输入数据包含多个测试实例，每个实例占一行，每行包含一个整数n(1<=n<=1000)，表示切的刀数。
 *
 *
 * Output
 * 对于每组输入数据，请输出对应的蛋糕块数，每个测试实例输出一行。
 *
 *
 * Sample Input
 * 1
 * 2
 * 3
 *
 *
 * Sample Output
 * 2
 * 4
 * 8
 */
import java.util.Scanner;
public class No1290 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        while(s.hasNext()){
            int n=s.nextInt();
            long sum = (n + 1) * (n * n - n + 6) / 6;

            System.out.println(sum);
        }
    }
}
