/**
 * @author ：Zeeland
 * @date ：Created in 2020/11/22 16:55
 * @version: 1.0$
 * Problem Description
 * 还记得中学时候学过的杨辉三角吗？具体的定义这里不再描述，你可以参考以下的图形：
 * 1
 * 1 1
 * 1 2 1
 * 1 3 3 1
 * 1 4 6 4 1
 * 1 5 10 10 5 1
 *
 *
 * Input
 * 输入数据包含多个测试实例，每个测试实例的输入只包含一个正整数n（1<=n<=30），表示将要输出的杨辉三角的层数。
 *
 *
 * Output
 * 对应于每一个输入，请输出相应层数的杨辉三角，每一层的整数之间用一个空格隔开，每一个杨辉三角后面加一个空行。
 *
 *
 * Sample Input
 * 2 3
 *
 *
 * Sample Output
 * 1
 * 1 1
 *
 * 1
 * 1 1
 * 1 2 1
 */
import java.util.Scanner;
public class No2032 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while (s.hasNext()) {
            int n = s.nextInt();
            if (n == 1) {
                System.out.println(1);
        } else {
                int count =0;
                for (int i = 0; i < n; i++) {
                    if(count == 0){
                        System.out.println(1);
                    }
                    count++;
                    for (int j = 0; j < i; j++) {
                        if (i == 0 && j == 0) {
                            System.out.println(1);
                        } else {
                            System.out.print(method(i, j));
                            if (j < i -1 ) {
                                System.out.print(" ");
                            }else if(j == i-1){
                                System.out.print(" ");
                                System.out.print(1);
                                System.out.println();
                            }
                        }
                    }
                }
            }
            System.out.println();
        }
    }
    public static long method(long i ,long j){
        long a = 1;
        long A =1;
        long B =1;
        if(j > i/2){
            j = i -j;
        }
        for(long n=j;n > 0;n--){
            B *= n;
        }
        for(long m = i;m >=(i-j+1);m--){
            A *= m;
        }
        a = A/B;
        return a;
    }
}
