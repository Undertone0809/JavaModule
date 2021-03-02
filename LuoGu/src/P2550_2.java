/**
 * @author ：Zeeland
 * @date ：Created in 2021/3/2 19:35
 * @version: 1.0$
 */

import java.util.Scanner;
public class P2550_2 {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        while(s.hasNext()){
            int n = s.nextInt();
            int []awa= new int[8];//获奖数组
            int []all= new int[34];//如果在样例中，则置1
            for (int i = 0; i < 7; i++) {
                all[s.nextInt()] = 1;
            }
            //n组彩票遍历
            for (int i = 0; i < n; i++) {
                int count =0;
                for (int i1 = 0; i1 < 7; i1++) {
                    //依次输入7个数字进行对比
                    //有x个重复则置入获奖数组中
                    int c = s.nextInt();
                    if(all[c] == 1) count++;
                }
                awa[count]++;
            }
            //倒序输出
            for(int j=awa.length-1;j>1;j--){
                System.out.print(awa[j]+" ");
            }
            System.out.println(awa[1]);
        }
    }
}

