/**
 * @author ：Zeeland
 * @date ：Created in 2020/11/26 21:17
 * @version: 1.0$
 */
import java.util.Scanner;
public class No1995 {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        while(s.hasNext()){
            int n =s.nextInt();
            for(int i =0; i< n;i++){
                int a =s.nextInt();
                int b =s.nextInt();
                long num =1;
                for(int j =0;j <(a-b);j++ ){
                    num *= 2;
                }
                System.out.println(num);
            }
        }
    }
}
