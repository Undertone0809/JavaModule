import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

/**
 * @author ：Zeeland
 * @date ：Created in 2021/3/7 22:58
 * @version: 1.0$
 */

public class P3370 {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        while(s.hasNext()){
            HashSet<String> set = new HashSet<>();
            int n=s.nextInt();
            for (int i = 0; i < n; i++) {
                set.add(s.next());
            }
            Iterator it =set.iterator();
            System.out.println(set.size());
        }
    }
}
