/**
 * @author ：Zeeland
 * @date ：Created in 2020/11/26 8:10
 * @version: 1.0$
 */
import java.util.Scanner;
public class No1021 {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        while(s.hasNext()) {
            int n =s.nextInt();
            if((n-2)%4 ==0){
                System.out.println("yes");
            }else{
                System.out.println("no");
            }


        }
    }
}
