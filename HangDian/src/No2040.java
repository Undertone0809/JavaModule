/**
 * @author ：Zeeland
 * @date ：Created in 2020/11/22 13:30
 * @version: 1.0$
 * Problem Description
 *
 * 古希腊数学家毕达哥拉斯在自然数研究中发现，220的所有真约数(即不是自身的约数)之和为：
 *
 * 1+2+4+5+10+11+20+22+44+55+110＝284。
 *
 * 而284的所有真约数为1、2、4、71、 142，加起来恰好为220。人们对这样的数感到很惊奇，并称之为亲和数。一般地讲，如果两个数中任何一个数都是另一个数的真约数之和，则这两个数就是亲和数。
 *
 * 你的任务就编写一个程序，判断给定的两个数是否是亲和数
 *
 *
 * Input
 * 输入数据第一行包含一个数M，接下有M行，每行一个实例,包含两个整数A,B； 其中 0 <= A,B <= 600000 ;
 *
 *
 * Output
 * 对于每个测试实例，如果A和B是亲和数的话输出YES，否则输出NO。
 *
 *
 * Sample Input
 * 2
 * 220 284
 * 100 200
 *
 *
 * Sample Output
 * YES
 * NO
 */

import java.util.Scanner;
public class No2040 {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        while(s.hasNext()){
            int n = s.nextInt();
            for(int i=0;i < n;i++){
                int a = s.nextInt();
                int b = s.nextInt();
                int suma =0 ,sumb=0;
                for(int j =1;j <= a / 2;j++){
                    if(a % j == 0){
                        suma += j;
                    }
                }
                for(int j =1;j <= b /2;j++){
                    if(b % j==0){
                        sumb +=j;
                    }
                }
                if(suma ==b&& sumb==a){
                    System.out.println("YES");
                }else{
                    System.out.println("NO");
            }
            }
        }
    }
}
