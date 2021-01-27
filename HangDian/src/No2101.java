/**
 * @author ：Zeeland
 * @date ：Created in 2020/11/30 21:12
 * @version: 1.0$
 */
import java.util.Scanner;
public class No2101 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        while(s.hasNext()){
            int a =s.nextInt();
            int b =s.nextInt();
            if((a+b) % 86 ==0){
                System.out.println("yes");
            }else{
                System.out.println("no");
            }
        }
    }
}
