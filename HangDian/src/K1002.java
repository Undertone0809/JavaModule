/**
 * @author ：Zeeland
 * @date ：Created in 2020/12/15 19:15
 * @version: 1.0$
 */
import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;
public class K1002 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        while(s.hasNext()){
            int  t =s.nextInt();
            for(int i =0;i<t;i++){
                int n =s.nextInt();
                int m =s.nextInt();
                int sum =0;
                for(int j =1;j<=m;j++){
                    sum += j;
                }
                if(n < sum){
                    System.out.println("NO");
                }else{
                    System.out.println("YES");
                }

            }
        }
    }
}
