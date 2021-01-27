import java.util.ArrayList;
import java.util.List;

/**
 * @author ：Zeeland
 * @date ：Created in 2020/12/30 23:48
 * @version: 1.0$
 */

public class LN09_List {
    public static void main(String[] args) {
        List arr =new ArrayList();
        for (int i = 0; i < 10; i++) {
            arr.add(i);
        }
        Integer []arr1 =new Integer[10];
        arr.toArray(arr1);
        for (int i = 0; i < 10; i++) {
            System.out.println(arr1[i]);
        }
    }
}
