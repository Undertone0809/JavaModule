/**
 * @author ：Zeeland
 * @date ：Created in 2021/3/6 14:38
 * @version: 1.0$
 */
package 天梯赛预选赛;
import java.util.Scanner;
public class No7_3 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        while(s.hasNext()){
            int n = s.nextInt();
            int num =0;
            int countJiShu=0;
            int countOuShu=0;
            for(int i = 0; i < n; i++) {
                num = s.nextInt();
                if(num % 2==0){
                    countOuShu++;
                }else{
                    countJiShu++;
                }
            }
            System.out.println(countJiShu+" "+countOuShu);
        }
    }
}
