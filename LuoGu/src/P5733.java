/**
 * @author ：Zeeland
 * @date ：Created in 2021/3/4 21:57
 * @version: 1.0$
 */
import java.util.Scanner;
public class P5733 {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        while(s.hasNext()){
            String str= s.next();
            char[]arr =str.toCharArray();
            for (int i = 0; i < arr.length; i++) {
                if(arr[i]>96&&arr[i]<123){
                    arr[i] -= 32;
                }
            }
            for (char c : arr) {
                System.out.print(c);
            }
            System.out.println();
        }
    }
}
