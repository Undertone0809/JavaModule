/**
 * @author ：Zeeland
 * @date ：Created in 2020/12/1 20:52
 * @version: 1.0$
 */
import java.util.Scanner;
public class No2524 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        while(s.hasNext()){
            int n =s.nextInt();
            while(n-->0){
                int a =s.nextInt();
                int tempa =a;
                int b =s.nextInt();
                int tempb =b;
                for(int i =1;i< tempa;i++){
                    a += i;
                }
                for(int j =1;j< tempb ;j++){
                    b += j;
                }
                System.out.println((a*b));
            }
        }
    }
}
