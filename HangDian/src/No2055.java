/**
 * @author ：Zeeland
 * @date ：Created in 2020/12/3 22:19
 * @version: 1.0$
 */
import java.util.Scanner;
public class No2055 {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        while(s.hasNext()){
            int n =s.nextInt();
            for(int i =0;i< n;i++){
                String str =s.next();
                int num =s.nextInt();
                System.out.println(method(str)+num);
            }
        }
    }
    public static int method(String str){
        int a =str.charAt(0);
        if(a < 97){
            a -= 64;
        }else if(a > 96){
            a = 96 - a;
        }
        return a ;
    }
}
