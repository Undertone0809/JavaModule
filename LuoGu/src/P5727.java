/**
 * @author ：Zeeland
 * @date ：Created in 2021/2/6 12:33
 * @version: 1.0$
 */
import java.util.ArrayList;
import java.util.Scanner;
public class P5727 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        while(s.hasNext()){
            long n =s.nextLong();
            ArrayList arr = new ArrayList();
            arr.add(n);
            while(n !=1){
                if(n % 2 !=0){
                    n = n *3 +1;
                    arr.add(n);
                }else{
                    n /=2;
                    arr.add(n);
                }
            }
            for (int i = arr.size()-1; i > 0; i--) {
                System.out.print(arr.get(i)+" ");
            }
            System.out.println(arr.get(0));
        }
    }
}
