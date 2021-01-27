/**
 * @author ：Zeeland
 * @date ：Created in 2020/12/1 15:18
 * @version: 1.0$
 */
import java.util.Scanner;
public class No2564 {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int n=s.nextInt();
        s.nextLine();
            for(int i =0;i < n;i++) {
                String str = s.nextLine();
                char[] arr = str.toCharArray();
                int count = 0;
                for (int j = 0; j < arr.length; j++) {
                    if (arr[j] == ' ') {
                        count++;
                    }
                }
                System.out.print((String.valueOf(arr[0]).toUpperCase()).charAt(0));
                if (count != 0) {
                    for (int j = 0; j < arr.length; j++) {
                        if (j < arr.length - 1) {
                            if (arr[j] == ' '&&arr[j+1]!=' ') {
                                System.out.print((String.valueOf(arr[j + 1]).toUpperCase()).charAt(0));
                            }
                        }
                    }
                }
                System.out.println();
            }
        s.close();
    }
}
