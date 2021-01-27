/**
 * @author ：Zeeland
 * @date ：Created in 2020/11/26 21:54
 * @version: 1.0$
 */
import java.util.Scanner;
public class No1108 {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        while(s.hasNext()){
            int a =s.nextInt();
            int b =s.nextInt();
            if(a < b){
                int temp = b;
                b = a;
                a =temp;
            }
            for(int i=1;i <= a*b;i++){
                if(i % a ==0 && i % b ==0){
                    System.out.println(i);
                    break;
                }
            }
        }
    }
}
