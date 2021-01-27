/**
 * @author ：Zeeland
 * @date ：Created in 2020/12/15 19:50
 * @version: 1.0$
 */
import java.util.Scanner;
public class K1008 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        while(s.hasNext()){
            int t =s.nextInt();
            for(int i =0;i<t;t++){
                int x =s.nextInt();
                int y =s.nextInt();
                System.out.println((x-1)+" "+y);
            }
            //2 3
            //0 1
            //2 2
            //0 1
        }
    }
}
