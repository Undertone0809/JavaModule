/**
 * @author ：Zeeland
 * @date ：Created in 2020/11/22 14:27
 * @version: 1.0$
 */
import java.util.Scanner;
public class No2044 {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        while(s.hasNext()){
            int n =s.nextInt();
            for(int i =0;i < n;i++){
                int b = s.nextInt();
                int a = s.nextInt();
                long []array = new long[51];
                array[0] = 1;
                array[1] = 1;
                array[2] = 2;
                array[3] = 3;
                array[4] = 5;
                for(int j =5;j < array.length;j++){
                    array[j] = array[j-1] +array[j -2];
                }

                int c = a - b;
                System.out.println(array[c]);
            }
        }
    }
}
