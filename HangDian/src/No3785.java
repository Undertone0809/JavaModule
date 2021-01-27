/**
 * @author ：Zeeland
 * @date ：Created in 2020/12/13 22:12
 * @version: 1.0$
 */
import java.util.*;
public class No3785 {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        while(s.hasNext()){
            int n =s.nextInt();
            int m =s.nextInt();
            if(m == 0&& n ==0){
                break;
            }
            int []arr=new int[n];
            for(int i =0;i < n;i++){
                arr[i] =s.nextInt();
            }
            Arrays.sort(arr);
            for(int i = arr.length-1;i >= arr.length-1-m;i--){
                if(i ==arr.length-m){
                    System.out.println(arr[i]);
                }else if(i > arr.length-m){
                    System.out.print(arr[i]+" ");
                }
            }
        }
    }
}
