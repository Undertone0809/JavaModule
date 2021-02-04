/**
 * @author ：Zeeland
 * @date ：Created in 2021/2/3 9:58
 * @version: 1.0$
 */
import java.util.Scanner;
public class P1980 {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        while(s.hasNext()){
            int n =s.nextInt();
            char str = s.next().charAt(0);
            //拆分i,然后toCharArray
            int count = 0;
            for(int i =1;i<=n;i++){
                char []arr =String.valueOf(i).toCharArray();
                for (int i1 = 0; i1 < arr.length; i1++) {
                    if(arr[i1] == str){
                        count++;
                    }
                }
            }
            System.out.println(count);
        }
    }
}
