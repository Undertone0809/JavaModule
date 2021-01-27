/**
 * @author ：Zeeland
 * @date ：Created in 2020/12/4 22:28
 * @version: 1.0$
 */
import java.util.*;
public class No1877 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while (s.hasNext()) {
            int m = s.nextInt();//m进制
            if (m == 0) {
                break;
            }
            int a = s.nextInt();
            int b = s.nextInt();
            method(a + b, m);
        }
    }

    //进制转换method
    //原理：短除法
    public static void method(int num, int m) {
        //考虑num == 0的情况
        if(num==0) {
            System.out.println(0);
            return;
        }
        int []arr=new int[1000];
        int count=-1;
        while(num!=0) {
            count++;
            arr[count]=num % m;
            num/=m;
        }
        //反向取数字
        for(;count >= 0; count--)
            System.out.print(arr[count]);
        System.out.println();
    }
}