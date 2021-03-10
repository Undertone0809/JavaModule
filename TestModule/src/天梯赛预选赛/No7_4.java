/**
 * @author ：Zeeland
 * @date ：Created in 2021/3/6 14:42
 * @version: 1.0$
 */
package 天梯赛预选赛;
import java.util.Scanner;
public class No7_4 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        while(s.hasNext()){
            int n = s.nextInt();//纸牌初始数字
            int m = s.nextInt();//推送的次数
            int zhiPai =n;
            int coin = 1;
            for (int i = 1; i <= m; i++) {
                //奇数 A->B zhipai = coin
                //偶数 B->A zhipai = 2 * coin
                if(i%2!=0){
                    //奇数
                    coin = zhiPai;
                }else{
                    zhiPai = 2 * coin;
                }
            }

            //如果m为奇数->coin 1
            //如果m为偶数->zhipai 0
            if(m%2==0){
                System.out.println(0+" "+zhiPai);
            }else{
                System.out.println(1+" "+coin);
            }

        }
    }
}
