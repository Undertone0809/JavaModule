/**
 * @author ：Zeeland
 * @date ：Created in 2021/3/2 19:06
 * @version: 1.0$
 */
import java.util.Scanner;
public class P2550 {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        while(s.hasNext()){
            int n = s.nextInt();
            int []arr= new int[7];//样例数组
            int []awa= new int[8];//获奖数组
            for (int i = 0; i < arr.length; i++) {
                arr[i] = s.nextInt();
            }
            //对比每一张
            for (int i = 0; i < n; i++) {
                int count = 0;
                for (int i1 = 0; i1 < 7; i1++) {
                    int mid = s.nextInt();
                    //遍历对比
                    for (int j = 0; j < arr.length; j++) {
                        if(arr[j] == mid) count++;
                    }
                }
                //如果有n个相等，则方法数组awa的第n-1个位置
                awa[count]++;
            }
            //最后倒序输出
            for (int i = awa.length-1; i > 1; i--) {
                System.out.print(awa[i]+" ");
            }
            System.out.println(awa[1]);
        }
    }
}
