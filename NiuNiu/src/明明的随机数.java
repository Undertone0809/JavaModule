/**
 * @author ：Zeeland
 * @date ：Created in 2020/12/23 22:42
 * @version: 1.0$
 */
import java.util.Arrays;
import java.util.Scanner;
public class 明明的随机数 {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        while(s.hasNext()){
            int n =s.nextInt();
            int []arr=new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = s.nextInt();
            }
            Arrays.sort(arr);
            int count =1;
            for (int i = 0; i < arr.length; i++) {
                if(i > 0 && arr[i] != arr[i-1] ){
                    count++;
                }
            }
            System.out.println(count);
            System.out.print(arr[0]+" ");
            for (int i = 0; i < arr.length; i++) {
                if(i > 0 && arr[i] != arr[i-1] && i < arr.length-1 ) {
                    System.out.print(arr[i] + " ");
                }else if(i > 0 && arr[i] != arr[i-1]){
                    System.out.print(arr[i]);
                }

            }
        }
    }
}
