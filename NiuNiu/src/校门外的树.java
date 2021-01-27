/**
 * @author ：Zeeland
 * @date ：Created in 2020/12/23 22:04
 * @version: 1.0$
 */
import java.util.*;
public class 校门外的树 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        while(s.hasNext()){
            int l = s.nextInt();
            int []arr =new int[l+1];
            Arrays.fill(arr,1);
            int m = s.nextInt();
            for (int i = 0; i < m; i++) {
                 int a = s.nextInt();
                 int b = s.nextInt();
                 Arrays.fill(arr,a,b+1,0);//左边闭区间右边开区间
            }
            int count =0;
            for (int i = 0; i < arr.length; i++) {
                if(arr[i] != 0){
                    count ++;
                }
            }
            System.out.println(count);
        }
    }
}
