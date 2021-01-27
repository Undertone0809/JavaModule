/**
 * 链接：https://ac.nowcoder.com/acm/contest/8582/D
 * 来源：牛客网
 *
 * 汪欧涛从林家回到自己家后，想了很久，感觉没有什么好玩的，就随手打开了我的世界。随机创建了一个存档，进入到了游戏之中。进入游戏之后，他发现了一个村庄，于是打算进入到村庄中看看。他在村庄入口的铁匠铺中获得了一些绿宝石，想和村民换一些食物以及其他物品。但是他发现这个村庄之中只有三个村民，由于这三个村民走来走去，欧涛发现他们的交易面板有时可以打开，有时却无法打开。欧涛感觉很奇怪，于是测得了这三个村民两两之间的距离。欧涛发现，当他们之间构成直角三角形的时候，交易面板可以打开，其他时候却不能。由于欧涛一心只想和村民进行交易，无法进行其他计算，因此他把这个问题交给了你。请你写一个程序判断是否可以和村民进行交易
 * 输入描述:
 * 输入三个整数，a b c，代表三个村民两两之间的距离。处理到文件的结尾。
 * 输出描述:
 * 如果欧涛可以进行交易，输出"YES" 否则，输出"NO"
 * 示例1
 * 输入
 * 复制
 * 3 4 5
 * 输出
 * 复制
 * YES
 * 示例2
 * 输入
 * 复制
 * 4 5 6
 * 输出
 * 复制
 * NO
 */

import java.util.Scanner;

public class 欧涛的游戏 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a,b,c;
        while(s.hasNext()){
            //输入三组数字
            a = s.nextInt();
            b = s.nextInt();
            c = s.nextInt();
            //c为斜边

            //如果a是最大值
            if(a > c && a > b){
                int temp = c;
                c = a;
                a = temp;
            }//如果b是最大值
            else if(c < b && b > a){
                int temp = c;
                c = b;
                b = temp;
            }
            //如果满足a方+b方=c方，输出结果
            if(a*a + b*b == c*c){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }


        }
    }
}
