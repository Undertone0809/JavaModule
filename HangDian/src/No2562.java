/**
 * @author ：Zeeland
 * @date ：Created in 2020/11/29 21:47
 * @version: 1.0$
 */
import java.util.Scanner;
public class No2562 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while (s.hasNext()) {
            int n = s.nextInt();
            for (int i = 0; i < n; i++) {
                String word = s.next();
                char[] arr = word.toCharArray();
                for (int j = 0; j < arr.length; j++) {
                    if (j == 0) {

                    } else if (j % 2 != 0) {
                        char temp = arr[j - 1];
                        arr[j - 1] = arr[j];
                        arr[j] = temp;
                    }
                }
                System.out.print(String.valueOf(arr));
            }
        }
    }

}