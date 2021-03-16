import java.lang.reflect.Array;
import java.util.Scanner;

/**
 * @author ：Zeeland
 * @date ：Created in 2021/3/10 23:15
 * @version: 1.0$
 */

public class P4414 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        while(s.hasNext()){
            int []arr=new int[3];
            String str = "";
            for (int i = 0; i < 4; i++) {
                if(i<3){
                    arr[i]=s.nextInt();
                }else{
                    str=s.next();
                }
            }
            int sum = arr[0]+arr[1]+arr[2];
            int min=Math.min(Math.min(arr[0],arr[1]),arr[2]);
            int max=Math.max(Math.max(arr[0],arr[1]),arr[2]);
            int mid=sum-min-max;
            
            char []strArr=str.toCharArray();



        }
    }
}
