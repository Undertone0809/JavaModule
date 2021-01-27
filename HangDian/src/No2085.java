/**
 * @author ：Zeeland
 * @date ：Created in 2020/11/30 19:08
 * @version: 1.0$
 */
import java.util.Scanner;
public class No2085 {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        while(s.hasNext()){
            int a=s.nextInt();
            if(a ==-1){
                break;
            }
            long m = 1;
            long n = 0;
            long tempm =0;
            long tempn =0;
            for(int i =0;i < a;i++){
                tempm =(3*m+2*n);
                tempn= m + n;
                m =tempm;
                n =tempn;
            }
            System.out.println(m+", "+n);
        }
    }
}
