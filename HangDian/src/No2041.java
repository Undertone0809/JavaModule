/**
 * @author ：Zeeland
 * @date ：Created in 2020/11/22 16:51
 * @version: 1.0$
 * Problem Description
 * 有一楼梯共M级，刚开始时你在第一级，若每次只能跨上一级或二级，要走上第M级，共有多少种走法？
 *
 *
 * Input
 * 输入数据首先包含一个整数N，表示测试实例的个数，然后是N行数据，每行包含一个整数M（1<=M<=40）,表示楼梯的级数。
 *
 *
 * Output
 * 对于每个测试实例，请输出不同走法的数量
 *
 *
 * Sample Input
 * 2
 * 2
 * 3
 *
 *
 * Sample Output
 * 1
 * 2
 */
import java.util.Scanner;
public class No2041 {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        while(s.hasNext()){
            int n =s.nextInt();
            for(int i =0;i < n;i++){
                int m = s.nextInt();
                long array[] =new long[41];
                array[0] = 1;
                array[1] = 1;
                array[2] = 2;
                array[3] = 3;
                array[4] = 5;
                for(int j =5;j < array.length;j++){
                    array[j] = array[j-1] +array[j -2];
                }
                System.out.println(array[m-1]);
            }
        }
    }
}
