/**
 * @author ：Zeeland
 * @date ：Created in 2021/3/2 19:51
 * @version: 1.0$
 */
import java.util.ArrayList;
import java.util.Scanner;
public class P1319 {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        while(s.hasNext()){
            int n =s.nextInt();
            int row =0;//定义列
            int local = 0;
            int []arr = new int[200];//1和0连续的个数
            int count = 0;
            int sum = 0;
            for (int i = 0;sum != n*n; i++) {
                arr[i] = s.nextInt();
                sum+=arr[i];
            }
            while(arr[count] != 0){
                local++;

                //有n个输出
                //local来确定输出0还是输出1
                if(local%2 ==0){
                    for (int i1 = 0; i1 < arr[count]; i1++) {
                        System.out.print(1);
                        row++;
                        if(row == n){
                            row =0;
                            System.out.println();
                        }
                    }
                }else{
                    for (int i1 = 0; i1 < arr[count]; i1++) {
                        System.out.print(0);
                        row++;
                        if(row == n){
                            row =0;
                            System.out.println();
                        }
                    }
                }
                count++;//count用于推进数组arr
            }
        }
    }

}