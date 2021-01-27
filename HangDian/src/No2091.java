/**
 * @author ：Zeeland
 * @date ：Created in 2020/11/30 20:03
 * @version: 1.0$
 */
import java.util.Scanner;
public class No2091 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int flag =0;//标志位，用于判断是否需要换行
        while(s.hasNext()){
            String str= s.next();

            if(str.equals("@")){
                break;
            }
            int n =s.nextInt();
            if(flag != 0){//如果不是第一轮，则输出换行
                System.out.println();
            }
            int count =0;
            for(int i =n;i > 0;i--) {
                if (i > 1) {
                    count++;
                    for (int j = 0; j < i - 1; j++) {
                        System.out.print(" ");
                    }
                    for (int k = 0; k < 2 * count - 1; k++) {
                        if (k == 2 * count - 2) {
                            System.out.println(str);
                        } else if (k == 0) {
                            System.out.print(str);
                        } else {
                            System.out.print(" ");
                        }
                    }
                } else if (i == 1) {
                    for (int k = 0; k < n * 2 - 1; k++) {

                        if (k == n * 2 - 2) {
                            System.out.println(str);
                        } else {
                            System.out.print(str);
                        }
                    }
                }
            }
        flag++;
        }
    }
}
