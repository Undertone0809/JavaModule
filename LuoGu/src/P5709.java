/**
 * @author ：Zeeland
 * @date ：Created in 2021/1/31 12:40
 * @version: 1.0$
 */
import java.util.Scanner;
public class P5709 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        while(s.hasNext()){
            int m =s.nextInt();
            int t =s.nextInt();
            int time =s.nextInt();
            int eatTime = m * t;
            int ans;
            if(eatTime <= time ){
                ans =0;
            }else{
                double k  =(double)time/t;
                ans = m -(int)Math.ceil(k);
            }
            System.out.println(ans);
        }
    }
}
