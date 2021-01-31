/**
 * @author ：Zeeland
 * @date ：Created in 2021/1/31 14:34
 * @version: 1.0$
 */
import java.util.Scanner;
public class P1085{
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        while(s.hasNext()){
            int ltime= 0;
            int max =0;
            int day =0;
            for (int i = 0; i < 7; i++) {
                ltime = s.nextInt()+s.nextInt();
                if(ltime > max && ltime > 8){
                    max = ltime;
                    day = i +1;
                }
            }
            System.out.println(day);
        }
    }
}