import java.util.Scanner;

/**
 * @author ：Zeeland
 * @date ：Created in 2021/3/8 23:56
 * @version: 1.0$
 */
public class P1102 {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        while(s.hasNext()){
            int n =s.nextInt();
            int m =s.nextInt();//要求等于的答案
            int []arr=new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] =s.nextInt();
            }
            //遍历
            //可能存在负数，因此需要判断两种情况
            int count=0;
            for (int i = 0; i < n; i++) {
                for (int j = i+1;j < n; j++) {
                    if(arr[i]-arr[j]==m||arr[j]-arr[i]==m){
                        count++;
                    }
                }
            }
            System.out.println(count);
        }
    }
}
