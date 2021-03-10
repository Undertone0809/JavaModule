/**
 * @author ：Zeeland
 * @date ：Created in 2021/3/2 20:50
 * @version: 1.0$
 */
import java.util.Scanner;
public class P1319_2 {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        while(s.hasNext()){
            int n = s.nextInt();
            int count =0;
            int row = 0;
            boolean flag =true;
            while(count != n*n){
                int a =s.nextInt();//输入要连续的个数
                if(flag){
                    for (int i = 0; i < a; i++) {
                        if(row==n){
                            System.out.println();
                            row =0;
                        }
                        System.out.print(0);
                        row++;
                        count++;
                    }

                }else{
                    for (int i = 0; i < a; i++) {
                        if(row==n){
                            System.out.println();
                            row =0;
                        }
                        System.out.print(1);
                        row++;
                        count++;
                    }
                }
                flag = !flag;
            }
        }
    }
}
